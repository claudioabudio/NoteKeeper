package com.example.notekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fab: View = findViewById(R.id.floatingActionButton)
        var textDisplayedValue : TextView = findViewById(R.id.textDisplayedValue);
        fab.setOnClickListener { view ->
            var value = textDisplayedValue.text.toString().toInt()
            value *= 2
            textDisplayedValue.setText(value.toString())
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
        }
    }
}