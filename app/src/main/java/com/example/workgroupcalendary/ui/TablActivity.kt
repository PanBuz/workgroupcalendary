package com.example.workgroupcalendary.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.workgroupcalendary.App
import com.example.workgroupcalendary.R
import com.example.workgroupcalendary.data.MainDB
import com.example.workgroupcalendary.data.Users
import com.example.workgroupcalendary.databinding.ActivityTablBinding

class TablActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTablBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTablBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_user)
        val db = MainDB.getDb(this)

        App.namesList.add("Пользователь")
        App.namesList.add("Лариса")
        App.namesList.add("Нина")
        App.namesList.add("Маша")
        App.namesList.add("Виолетта")
        App.namesList.add("Лена")
        App.namesList.add("Кристина")



        val adapter = Adapter(App.namesList, App.myArray)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        binding.putUser.setOnClickListener{
            val user = Users(null,
                binding.
            )
        }
    }


    }