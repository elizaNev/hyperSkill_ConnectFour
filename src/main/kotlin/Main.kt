var firstPlayer: String = ""
var secondPlayer: String = ""
var rows: Int = 6
var columns: Int = 7
val rowsAndColsValidRange = (5..9)

fun readPlayers() {
    println("First player's name:")
    firstPlayer = readln()
    println("Second player's name:")
    secondPlayer = readln()
}
fun splitIntoRowsAndColumns(sizeBoard: String) {
    val splitBoard = sizeBoard.split("x")
    rows = splitBoard.first().toInt()
    columns = splitBoard.last().toInt()

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
        printInformGame()
        return
    }
    if (format.matches(sizeBoard)) {
        splitIntoRowsAndColumns(sizeBoard)
        if (rowsAndColsValidRange.contains(rows) && rowsAndColsValidRange.contains(columns)) {
            printInformGame()
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
fun main(args: Array<String>) {
    println("Connect Four")
    readPlayers()
    createBoard()
}