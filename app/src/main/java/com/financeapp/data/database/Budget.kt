package com.financeapp.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "budgets")
data class Budget(
    @PrimaryKey val id: String,
    val categoryId: String,
    val amount: Double,
    val month: Int,
    val year: Int,
    val spent: Double = 0.0
)