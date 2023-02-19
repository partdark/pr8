package com.example.pr8

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView : ImageView = findViewById(R.id.imageView)
        val textView : TextView = findViewById(R.id.textView)
        val button : Button = findViewById(R.id.button)


        val popupMenu = androidx.appcompat.widget.PopupMenu(this, imageView)
        popupMenu.inflate(R.menu.popupmenu)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu1 -> {
                    textView.text = "Нажат пункт PopMenu 1"
                    true
                }
                R.id.menu2 -> {
                    textView.text = "Нажат пункт PopMenu 2"
                    true
                }
                R.id.menu2 -> {
                    textView.text = "Нажат пункт PopMenu 3"
                    true
                }
                 else -> false
            }
        }
        imageView.setOnClickListener {
            popupMenu.show()
        }
        val popupMenu2 = PopupMenu(this, button)
        popupMenu2.inflate(R.menu.popmenu2)
        popupMenu2.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.red -> {
                    textView.background = ColorDrawable(Color.RED)
                    textView.text = "Its red"
                }
                R.id.yellow -> {
                    textView.background= ColorDrawable(Color.YELLOW)
                    textView.text = "its yellow"
                }
                R.id.green -> {
                    textView.background = ColorDrawable(Color.GREEN)
                    textView.text= "its green"
                }
            }
                false
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q ) {
            popupMenu2.setForceShowIcon(true)

        }
        button.setOnClickListener {
            popupMenu2.show()
        }

        val popupMenu3 = PopupMenu(this, button)
        popupMenu3.inflate(R.menu.popmenu)
        popupMenu3.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.big -> {
                    textView.textSize = 36F
                    textView.text = "Its big"
                }
                R.id.normal -> {
                    textView.textSize = 18F
                    textView.text = "Its normal"
                }
                R.id.small -> {
                    textView.textSize = 12F
                    textView.text = "Its small"
                }
            }
            false
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q ) {
            popupMenu3.setForceShowIcon(true)

        }
        textView.setOnClickListener {
            popupMenu3.show()
        }
    }
}