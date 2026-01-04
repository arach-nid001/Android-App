package com.financeapp.di

import android.content.Context
import androidx.room.Room
import com.financeapp.data.database.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    
    @Provides
    @Singleton
    fun provideFinanceDatabase(@ApplicationContext context: Context): FinanceDatabase {
        return Room.databaseBuilder(
            context,
            FinanceDatabase::class.java,
            "finance_database"
        ).build()
    }
    
    @Provides
    fun provideTransactionDao(database: FinanceDatabase): TransactionDao = database.transactionDao()
    
    @Provides
    fun provideCategoryDao(database: FinanceDatabase): CategoryDao = database.categoryDao()
    
    @Provides
    fun provideBudgetDao(database: FinanceDatabase): BudgetDao = database.budgetDao()
}