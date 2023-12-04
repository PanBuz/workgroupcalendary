package com.example.workgroupcalendary

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()

    }

    companion object {
        var namesList= mutableListOf<String>()
        val myArray = List(31) { i -> i + 1 }
        val user_0 : String = "Пользователь"

    }
}