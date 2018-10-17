package com.example.michaelsmiley.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    fun clear(view: View)
    {
        count = 0
        textView.text = count.toString()
    }

    fun addOne(view: View)
    {
        count += 1
        textView.text = count.toString()
    }

    fun removeOne(view: View)
    {
        count -= 1
        textView.text = count.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        textView.text = "Start Counting!"
    }
}
