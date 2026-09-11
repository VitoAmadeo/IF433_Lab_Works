package oop_001_VitoAmadeoD.week02

import java.util.Scanner

class Loan(val bookTitle: String,val borrower: String,var loanDuration: Int = 0)
{
    fun calculateFine() = if (loanDuration > 3) (loanDuration - 3)*2000 else 0
}

fun main()
{
    val scanner = Scanner(System.`in`)
    print("Insert Title : ")
    val bookTitle = scanner.nextLine()

    print("Insert Name : ")
    val borrower = scanner.nextLine()

    print("Insert how many days you have borrowed : ")
    val localDuration = scanner.nextInt()

    scanner.nextLine()

    val loan = Loan(bookTitle, borrower, localDuration)
    val fine = loan.calculateFine()
    println("Your book: ${loan.bookTitle}, your name: ${loan.borrower},Your Duration: ${loan.loanDuration}, fine: $fine")

}