package com.tenskyline.myfirstapp

import androidx.compose.material3.Text
import androidx.compose.ui.Modifier



fun main() {
    val aBankAccount = BankAccount("a",1982.59)
    val sarahBankAccount =BankAccount("Sarah",0.0)

    sarahBankAccount.deposit(200.0)
    sarahBankAccount.deposit(300.0)
    sarahBankAccount.withdraw(120.0)
    aBankAccount.deposit(200.0)
    aBankAccount.displayTransactionHistory()
    println(aBankAccount.accBalance())
    sarahBankAccount.displayTransactionHistory()
    println(sarahBankAccount.accBalance())
}



/*
data class CoffeDetails(
    val sugarCount: Int,
    val name : String,
    val size:String,
    val creamAmount:Int
)

fun makeCoffe(coffeDetails: CoffeDetails) {
    if (coffeDetails.sugarCount == 1) {
        println("Coffe with ${coffeDetails.sugarCount} spoon of sugar, ${coffeDetails.creamAmount} of cream, and ${coffeDetails.size} size for ${coffeDetails.name}")
    } else if (coffeDetails.sugarCount == 0){
        println("Coffe with no sugar, ${coffeDetails.creamAmount} of cream, and ${coffeDetails.size} size for ${coffeDetails.name}")
    } else {
        println("Coffe with ${coffeDetails.sugarCount} spoons of sugar, ${coffeDetails.creamAmount} of cream, and ${coffeDetails.size} size for ${coffeDetails.name}")
    }
}
*/