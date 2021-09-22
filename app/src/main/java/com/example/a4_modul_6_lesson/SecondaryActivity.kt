package com.example.a4_modul_6_lesson

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_secondary_layout.*

class SecondaryActivity:AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary_layout)

        val button = Button(this)
        button.text = "Artikov"
        container.addView(button)

       /* val linearLayout = LinearLayout(this)
        val linearLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        val textView = TextView(this)
        textView.text = "PDP Online"
        textView.setTextColor(resources.getColor(R.color.teal_700))
        linearLayout.addView(textView)

        linearLayout.setBackgroundColor(Color.CYAN)
        linearLayout.gravity = Gravity.CENTER
        linearLayout.layoutParams = linearLayoutParams
        setContentView(linearLayout,linearLayoutParams)*/
    }
}