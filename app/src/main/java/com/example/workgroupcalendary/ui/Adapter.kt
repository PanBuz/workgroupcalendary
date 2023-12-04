package com.example.workgroupcalendary.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.workgroupcalendary.App.Companion.myArray
import com.example.workgroupcalendary.App.Companion.namesList
import com.example.workgroupcalendary.R
import com.example.workgroupcalendary.data.Users
import com.example.workgroupcalendary.databinding.ActivityTablBinding
import com.example.workgroupcalendary.databinding.ActivityTablBinding.*

class Adapter(private val names_List: List<String>, private val dataArray: List<Int>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    lateinit var binding: ActivityTablBinding

    // Создаем ViewHolder для элементов списка
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val userView: TextView = itemView.findViewById(R.id.user_1)

        val dataView_1: TextView = itemView.findViewById(R.id.data_1)
        val dataView_2: TextView = itemView.findViewById(R.id.data_2)
        val dataView_3: TextView = itemView.findViewById(R.id.data_3)
        val dataView_4: TextView = itemView.findViewById(R.id.data_4)
        val dataView_5: TextView = itemView.findViewById(R.id.data_5)
        val dataView_6: TextView = itemView.findViewById(R.id.data_6)
        val dataView_7: TextView = itemView.findViewById(R.id.data_7)
        val dataView_8: TextView = itemView.findViewById(R.id.data_8)
        val dataView_9: TextView = itemView.findViewById(R.id.data_9)
        val dataView_10: TextView = itemView.findViewById(R.id.data_10)
        val dataView_11: TextView = itemView.findViewById(R.id.data_11)
        val dataView_12: TextView = itemView.findViewById(R.id.data_12)
        val dataView_13: TextView = itemView.findViewById(R.id.data_13)
        val dataView_14: TextView = itemView.findViewById(R.id.data_14)
        val dataView_15: TextView = itemView.findViewById(R.id.data_15)
        val dataView_16: TextView = itemView.findViewById(R.id.data_16)
        val dataView_17: TextView = itemView.findViewById(R.id.data_17)
        val dataView_18: TextView = itemView.findViewById(R.id.data_18)
        val dataView_19: TextView = itemView.findViewById(R.id.data_19)
        val dataView_20: TextView = itemView.findViewById(R.id.data_20)
        val dataView_21: TextView = itemView.findViewById(R.id.data_21)
        val dataView_22: TextView = itemView.findViewById(R.id.data_22)
        val dataView_23: TextView = itemView.findViewById(R.id.data_23)
        val dataView_24: TextView = itemView.findViewById(R.id.data_24)
        val dataView_25: TextView = itemView.findViewById(R.id.data_25)
        val dataView_26: TextView = itemView.findViewById(R.id.data_26)
        val dataView_27: TextView = itemView.findViewById(R.id.data_27)
        val dataView_28: TextView = itemView.findViewById(R.id.data_28)
        val dataView_29: TextView = itemView.findViewById(R.id.data_29)
        val dataView_30: TextView = itemView.findViewById(R.id.data_30)
        val dataView_31: TextView = itemView.findViewById(R.id.data_31)
    }
    // Создаем новые элементы списка (вызывается LayoutManager-ом)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_count, parent, false)
        return ViewHolder(view)
    }


    // Устанавливаем данные элемента списка
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if (position == 0) {
            holder.userView.text = namesList[position]
            holder.dataView_1.text = myArray[0].toString()
            holder.dataView_2.text = myArray[1].toString()
            holder.dataView_3.text = myArray[2].toString()
            holder.dataView_4.text = myArray[3].toString()
            holder.dataView_5.text = myArray[4].toString()
            holder.dataView_6.text = myArray[5].toString()
            holder.dataView_7.text = myArray[6].toString()
            holder.dataView_8.text = myArray[7].toString()
            holder.dataView_9.text = myArray[8].toString()
            holder.dataView_10.text = myArray[9].toString()
            holder.dataView_11.text = myArray[10].toString()
            holder.dataView_12.text = myArray[11].toString()
            holder.dataView_13.text = myArray[12].toString()
            holder.dataView_14.text = myArray[13].toString()
            holder.dataView_15.text = myArray[14].toString()
            holder.dataView_16.text = myArray[15].toString()
            holder.dataView_17.text = myArray[16].toString()
            holder.dataView_18.text = myArray[17].toString()
            holder.dataView_19.text = myArray[18].toString()
            holder.dataView_20.text = myArray[19].toString()
            holder.dataView_21.text = myArray[20].toString()
            holder.dataView_22.text = myArray[21].toString()
            holder.dataView_23.text = myArray[22].toString()
            holder.dataView_24.text = myArray[23].toString()
            holder.dataView_25.text = myArray[24].toString()
            holder.dataView_26.text = myArray[25].toString()
            holder.dataView_27.text = myArray[26].toString()
            holder.dataView_28.text = myArray[27].toString()
            holder.dataView_29.text = myArray[28].toString()
            holder.dataView_30.text = myArray[29].toString()
            holder.dataView_31.text = myArray[30].toString()

        }
        else {
            holder.userView.text = namesList[position]
            val userData_1 = Users(null,
                holder.userView.text.toString(),
                holder.dataView_1.text.toString()  )
        }
    }

    // Возвращает общее количество элементов в данных
    override fun getItemCount(): Int {
        return names_List.size
    }
}