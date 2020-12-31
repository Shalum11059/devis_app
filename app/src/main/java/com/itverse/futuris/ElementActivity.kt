package com.itverse.futuris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_element.*

class ElementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_element)

        //composant_list.layoutManager = LinearLayoutManager(this)
        composant_list.layoutManager = GridLayoutManager(this, 2)
        composant_list.adapter = ElementRecyclerAdapter(this, DataManager.elements)
    }
}