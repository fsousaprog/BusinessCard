package com.businesscard

import android.app.Application
import com.businesscard.data.AppDatabase
import com.businesscard.data.BusinessCardRepository

class App : Application() {
    private val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}