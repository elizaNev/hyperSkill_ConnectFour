import java.lang.Integer.min
import kotlin.system.exitProcess

var firstPlayer: String = ""
var secondPlayer: String = ""
var rows: Int = 6
var columns: Int = 7
val rowsAndColsValidRange = (5..9)
var board = mutableListOf<MutableList<String>>()
var chooseColumnInt = 0
var chooseRowInt = 0
var pointsFirst = 0
var pointsSecond = 0

fun readPlayers() {
    println("First player's name:")
    firstPlayer = readln()
    println("Second player's name:")
    secondPlayer = readln()
}
fun printInformGame() {
    println("$firstPlayer VS $secondPlayer")
    println("$rows X $columns board")
}
fun createBoard() {
    println("Set the board dimensions (Rows x Columns)")
    println("Press Enter for default (6 x 7)")
    val sizeBoard = readln().lowercase().replace(" ", "").replace("\t", "")
    val format = Regex("""\d?\dx\d\d?""")
    if (sizeBoard == "") {
        repeat(rows) {
            board.add(MutableList(columns) {""})
        }
        return
    }
    if (format.matches(sizeBoard)) {
        val splitBoard = sizeBoard.split("x")
        rows = splitBoard.first().toInt()
        columns = splitBoard.last().toInt()
        if (rowsAndColsValidRange.contains(rows) && rowsAndColsValidRange.contains(columns)) {
            // printInformGame()
            repeat(rows) {
                board.add(MutableList(columns) {""})
            }
            // printBoard()
        } else {
            if (rowsAndColsValidRange.contains(rows)) {
                println("Board columns should be from 5 to 9")
                createBoard()
            } else {
                println("Board rows should be from 5 to 9")
                createBoard()
            }
        }
    } else {
        println("Invalid input")
        return createBoard()
    }
}

fun printBoard() {
    for (numberColumns in 1..columns) {
        print(" $numberColumns")
    }
    println()
    for (row in board) {
        for (col in row) {
            if (col.isEmpty()) {
                print("║ ")
            } else print("║$col")
        }
        println("║")
    }
    println("╚═" + "╩═".repeat(columns - 1) + "╝")
}

fun main() {
    // подготовка к игре
    println("Connect Four")
    readPlayers()
    createBoard()
    // выбор игры одиночная?
    chooseGame()
    // игра
    // playsPlayer(firstPlayer,symbolForPlayer(firstPlayer))
}

fun chooseGame() {
    println("Do you want to play single or multiple games?\n" +
            "For a single game, input 1 or press Enter\n" +
            "Input a number of games:")
    val chosenGame = readln()
    if (chosenGame == "" || chosenGame == "1") { // одиночная игра
        printInformGame()
        println("Single game")
        printBoard()
        playsPlayer(firstPlayer,symbolForPlayer(firstPlayer))
        println("Game over!")
    }
    val chosenGameInt = chosenGame.toIntOrNull()
    if (chosenGameInt != null && chosenGameInt > 0) { // несколько игр
        printInformGame()
        println("Total $chosenGameInt games")
        var startPlayer = firstPlayer
        for (times in 1..chosenGameInt) {
            println("Game #$times")
            printBoard()
            game(startPlayer)
            startPlayer = nextPlayer(startPlayer)
            board.clear()
            repeat(rows) {
                board.add(MutableList(columns) {""})
            }
        }
        println("Game over!")
        // Определить кол-во игр. Начать игру
        // Первая игра завершена. Определить победителя. Показать счет
        // Начать вторую игру. Определить победителя. Показать счет
        // ...
        // Провести выбранное кол-во игр.
        // Определить победителя
    } else {
        println("Invalid input")
        return chooseGame()
    }
}

fun game(player: String){
    // возвращает последнего игрока или признак ничьи
    when (playsPlayer(player,symbolForPlayer(player))) {
        0 -> {
            pointsFirst++
            pointsSecond++
        }

        1 -> pointsFirst += 2
        2 -> pointsSecond += 2
    }
    println("Score\n" +
            "$firstPlayer: $pointsFirst $secondPlayer: $pointsSecond")
}
fun putSymbol(column: Int, symbol: String): Boolean { // true - запись символа успешна, false - переполнение столбца
    for (row in rows - 1 downTo 0) {
        if (board[row][column - 1].isEmpty()) {
            board[row][column - 1] = symbol
            chooseRowInt = row
            return true
        }
    }
    return false
}
fun nextPlayer(currentPlayer: String): String {
    return if (currentPlayer == firstPlayer) secondPlayer
    else firstPlayer
}
fun symbolForPlayer(currentPlayer: String): String {
    return if (currentPlayer == firstPlayer) "o"
    else "*"
}
fun playsPlayer(player: String, symbol: String): Int { // 0 - ничья, 1- выиграл первый, 2 - выиграл второй
    println("$player's turn:")
    val chooseColumn = readln()
    if (chooseColumn == "end") {
        println("Game over!")
        exitProcess(0)
    }
    if (chooseColumn.toIntOrNull() != null) {
        chooseColumnInt = chooseColumn.toInt()
        if (chooseColumnInt in 1..columns) {
            if (putSymbol(chooseColumnInt, symbol)) { // корректный столбец и установка символа
                printBoard()
                if (horizontalCheckForWin(symbol) || verticalCheckForWin(symbol) || diagonalCheckForWin(symbol)) {
                    println("Player $player won")
                    return if (player == firstPlayer) 1 else 2
                } else {
                    if (isDraw()) { // true - есть пустой элемент, false - нет
                        println("It is a draw\n")
                        return 0
                    }
                    val nextPl = nextPlayer(player)
                    return playsPlayer(nextPl, symbolForPlayer(nextPl))
                }
            } else {
                println("Column $chooseColumnInt is full")
                return playsPlayer(player, symbol)
            }
        }
        else {
            println("The column number is out of range (1 - $columns)")
            return playsPlayer(player, symbol)
        }
    } else {
        println("Incorrect column number")
        return playsPlayer(player, symbol)
    }
}

fun isDraw(): Boolean {
    var countEmpty = false
    for (row in 0 until rows) {
        for (col in 0 until columns) {
            if (board[row][col].isEmpty()) countEmpty = true
        }
    }
    return !countEmpty
}

fun horizontalCheckForWin(symbol: String): Boolean {
    var countSameSymbol = 0
    for (col in 0 until columns) {
        if (board[chooseRowInt][col] == symbol) {
            countSameSymbol++
            if (countSameSymbol == 4) {
                return true
            }
        } else {
            countSameSymbol = 0
        }
    }
    return false // true - есть 4 фишки по горизонтали, false - нет
}
fun verticalCheckForWin(symbol: String): Boolean {
    var countSameSymbol = 0
    for (row in rows - 1 downTo 0) {
        if (board[row][chooseColumnInt - 1] == symbol) {
            countSameSymbol++
            if (countSameSymbol == 4) {
                return true
            }
        } else {
            countSameSymbol = 0
        }
    }
    return false // true - есть 4 фишки по вертикали, false - нет
}
fun diagonalCheckForWin(symbol: String): Boolean {
    var countSameSymbol = 0
    // поиск начала диагонали вниз
    val chosenColIndex = chooseColumnInt - 1
    val chosenRowIndex = chooseRowInt
    var distance = min(chosenRowIndex, chosenColIndex)
    var startDiagRowIndex = chosenRowIndex - distance
    var startDiagColIndex = chosenColIndex - distance
    var lenDiag = min(rows - 1 - startDiagRowIndex, columns - 1 - startDiagColIndex)
    for (step in 0..lenDiag) {
        if (board[startDiagRowIndex + step][startDiagColIndex + step] == symbol) {
            countSameSymbol++
            if (countSameSymbol == 4) {
                return true
            }
        } else {
            countSameSymbol = 0
        }
    }
    // поиск начала диагонали вверх
    distance = min(rows - 1 - chosenRowIndex, chosenColIndex)
    startDiagRowIndex = chosenRowIndex + distance
    startDiagColIndex = chosenColIndex - distance
    lenDiag = min(startDiagRowIndex, columns - 1 - startDiagColIndex)
    countSameSymbol = 0
    for (step in 0..lenDiag) {
        if (board[startDiagRowIndex - step][startDiagColIndex + step] == symbol) {
            countSameSymbol++
            if (countSameSymbol == 4) {
                return true
            }
        } else {
            countSameSymbol = 0
        }
    }
    return false
}