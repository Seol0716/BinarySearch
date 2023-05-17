package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val array = ArrayList<String>()

        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")

        val customAdapter = CustomAdapter(array)

        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.adapter = customAdapter
        rv.layoutManager = LinearLayoutManager(this)

        /*
        binding.testText.text = "변경된 텍스트"

        binding.testText.setOnClickListener{
            val intent = Intent(this,Second_Activity::class.java)
            startActivity(intent)
            */
    }
    }

