package com.financeapp.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey val id: String,
    val amount: Double,
    val category: String,
    val type: TransactionType,
    val date: Date,
    val description: String,
    val paymentMethod: String = "Cash"
)

enum class TransactionType {
    INCOME, EXPENSE
}