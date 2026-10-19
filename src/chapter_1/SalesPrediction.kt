package chapter_1

private const val ANNUAL_PROFIT_PERCENT = 23

/**
 * A company has determined that its annual profit is typically 23 percent of total sales. Design a Python program that asks
 * the user to enter the projected amount of total sales, and then displays the profit that will be made from that amount.
 * Hint: Use the value 0.23 to represent 23 percent.
 */
fun main() {

    print("Enter Total Sales: ")
    val totalSales = readln().toDoubleOrNull()

    if (totalSales == null) {
        println("ERROR: Invalid totalSales. Please enter a valid number fo total sales.")
        return
    }

    val profit = totalSales * ANNUAL_PROFIT_PERCENT / 100

    println("Profit: $profit")
}
