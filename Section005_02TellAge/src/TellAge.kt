/**
 * Karly KOUEKA
 * copyright 2024
 */

const val CURRENT_YEAR = 2024


fun main(args: Array<String>) {

    println("Enter Year of Birth");
    val number = readLine()?:""
    println("Value read is : $number")
    println("You are ${CURRENT_YEAR - number.toInt()} year(s) old")

}