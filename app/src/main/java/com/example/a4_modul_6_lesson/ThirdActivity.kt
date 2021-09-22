package com.example.a4_modul_6_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.text.set
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity(), View.OnClickListener {

    var number1:Double = 0.0
    var number2:Double = 0.0
    var amal:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)
        four.setOnClickListener(this)
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
        nine.setOnClickListener(this)
        zero.setOnClickListener(this)
        tenglik.setOnClickListener(this)
        plus_btn.setOnClickListener(this)
        plus_minus.setOnClickListener(this)
        minus.setOnClickListener(this)
        multi.setOnClickListener(this)
        div.setOnClickListener(this)
        clear.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id

        when(id){

            R.id.one -> {

                number1 = number1 * 10 + 1

            }

            R.id.two -> {

                number1 = number1 * 10 + 2

            }

            R.id.three -> {

                number1 = number1 * 10 + 3

            }

            R.id.four ->{
                number1 = number1 * 10 + 4
            }
            R.id.five ->{
                number1 = number1 * 10 + 5
            }
            R.id.six ->{
                number1 = number1 * 10 + 6
            }
            R.id.seven ->{
                number1 = number1 * 10 + 7
            }
            R.id.eight ->{
                number1 = number1 * 10 + 8
            }
            R.id.nine ->{
                number1 = number1 * 10 + 9
            }
            R.id.zero ->{
                number1 *= 10
            }
            R.id.plus_btn -> {
                tenglik()
                number2 = number1
                number1 = 0.0
                amal = 1
            }

            R.id.minus -> {
                tenglik()
                number2 = number1
                number1 = 0.0
                amal = 2
            }

            R.id.multi -> {
                tenglik()
                number2 = number1
                number1 = 0.0
                amal = 3
            }

            R.id.div ->{
                number2 = number1
                number1 = 0.0
                amal = 4
            }

            R.id.plus_minus -> {
                number1 *= -1
            }

            R.id.tenglik -> {
                tenglik()
                number2 = 0.0
            }
            R.id.clear -> {
                number1 = 0.0
            }

        }

        edit_calc.setText(number1.toString())

    }

    fun tenglik(){
        when(amal){
            1 -> {
                number1 += number2
            }
            2 -> {
                number1 =  number2 - number1
            }
            3 -> {
                number1 *= number2
            }
            4 -> {
                number1 = number2 / number1
            }
        }
    }
}