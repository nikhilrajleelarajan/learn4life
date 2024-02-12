package com.nikhil.basic.recyclerview.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.nikhil.basic.recyclerview.example.adapter.RecyclerViewAdapter
import com.nikhil.basic.recyclerview.example.databinding.ActivityMainBinding
import com.nikhil.basic.recyclerview.example.model.Fruit

class MainActivity : AppCompatActivity() {
    val fruitList : List<Fruit> = listOf(Fruit("Mango","ABY"), Fruit("Orange","Joe"))
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = RecyclerViewAdapter(fruitList) { selectedItem: Fruit ->
            onItemSelected(selectedItem)
        }
    }

    fun onItemSelected(fruit:Fruit){
        Toast.makeText(this@MainActivity,"Selected Item "+fruit.fruitName,Toast.LENGTH_LONG).show()
    }
}