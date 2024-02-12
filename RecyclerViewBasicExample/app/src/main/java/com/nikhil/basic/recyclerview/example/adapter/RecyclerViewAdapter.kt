package com.nikhil.basic.recyclerview.example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nikhil.basic.recyclerview.example.R
import com.nikhil.basic.recyclerview.example.model.Fruit

class RecyclerViewAdapter(private val fruitsList: List<Fruit>, private val clickListener:(Fruit) -> Unit) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(fruitsList.get(position),clickListener)
    }


}

class ViewHolder(private val view: View):RecyclerView.ViewHolder(view){
    fun bind(fruit: Fruit, clickListener: (Fruit) -> Unit){
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = fruit.fruitName
        view.setOnClickListener{
            clickListener(fruit)
        }
    }

}