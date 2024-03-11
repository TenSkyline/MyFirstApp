package com.tenskyline.myfirstapp

class BankAccount(var accountHolder : String, var balance : Double) {
    private val transactionHistory = mutableListOf<String>()


    fun deposit (amount : Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw (amount : Double){
        if (amount<=balance){
            //we can withdraw
            balance -= amount
            transactionHistory.add("$accountHolder withdraw $$amount")
        } else {
            //we can't withdraw
            println("You dont have enough money to withdraw")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history from $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }

    fun accBalance(){
        println("$accountHolder's balance is $$balance")
    }

}