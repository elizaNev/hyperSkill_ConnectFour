var firstPlayer: String = ""
var secondPlayer: String = ""
var rows: Int = 6
var columns: Int = 7
var enterColumns = 0
var enterRows = 0
fun readPlayers():String {
    println("First player's name:")
    firstPlayer = readln()
    println("Second player's name:")
    secondPlayer = readln()
    return firstPlayer
    return secondPlayer
}
fun splitIntoRowsAndColumns(sizeBoard: String): Int {
    var splitBoard = sizeBoard.lowercase().split("x")
    enterRows = splitBoard.first().trim().toInt()
    enterColumns = splitBoard.last().trim().toInt()
    return enterRows
    return enterColumns
}
fun createBoard() {
    println("Set the board dimensions (Rows x Columns)")
    println("Press Enter for default (6 x 7)")
    val sizeBoard = readln()
    val formatWithSpace = Regex(".?. x?X? .?.")
    val formatWithoutSpace = Regex(".?.x?X?.?.")
    if (formatWithSpace.matches(sizeBoard) || formatWithoutSpace.matches(sizeBoard)) {
        splitIntoRowsAndColumns(sizeBoard)
        if ((enterRows > 4 && enterRows < 10) && (enterColumns > 4 && enterColumns < 10)) {
            println("$firstPlayer VS $secondPlayer")
            println("$enterRows X $enterColumns board")
        } else {
            println("Board columns should be from 5 to 9")
            return createBoard()
        }
    } else {
        if (sizeBoard == "") {
            println("$firstPlayer VS $secondPlayer")
            println("$rows X $columns board")
        } else {
            println("Invalid input")
            return createBoard()
        }
    }
}
fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Connect Four")
    readPlayers()
    createBoard()
}