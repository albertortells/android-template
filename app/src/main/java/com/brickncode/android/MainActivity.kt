package com.brickncode.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.txtvw_title)
        title.setText(R.string.main_title)

        val btnGetAll = findViewById<Button>(R.id.btn_getAll)
        btnGetAll.setText(R.string.get_all)

        val btnGetOne = findViewById<Button>(R.id.btn_getOne)
        btnGetOne.setText(R.string.get_one)

        val btnSave = findViewById<Button>(R.id.btn_save)
        btnSave.setText(R.string.save_example)

        val btnUpdate = findViewById<Button>(R.id.btn_update)
        btnUpdate.setText(R.string.update_example)

        val btnDelete = findViewById<Button>(R.id.btn_delete)
        btnDelete.setText(R.string.delete_example)
    }
}