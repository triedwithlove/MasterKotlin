/**
 * Karly KOUEKA
 * copyright 2024
 */

fun main(args: Array<String>) {
/*
    println("Enter a Number");
    val number = readLine()
    println("Value read is : $number")
*/

    println("Enter a Number");
    val number = readLine()?:""
    println("Value read is : $number")
    println("Integer half of the number is ${number.toInt() / 2 }")

}