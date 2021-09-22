package com.example.a4_modul_6_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calc_math.*
import kotlinx.android.synthetic.main.activity_third.*
import kotlinx.android.synthetic.main.activity_third.clear
import kotlinx.android.synthetic.main.activity_third.div
import kotlinx.android.synthetic.main.activity_third.edit_calc
import kotlinx.android.synthetic.main.activity_third.eight
import kotlinx.android.synthetic.main.activity_third.five
import kotlinx.android.synthetic.main.activity_third.four
import kotlinx.android.synthetic.main.activity_third.minus
import kotlinx.android.synthetic.main.activity_third.multi
import kotlinx.android.synthetic.main.activity_third.nine
import kotlinx.android.synthetic.main.activity_third.one
import kotlinx.android.synthetic.main.activity_third.plus_btn
import kotlinx.android.synthetic.main.activity_third.plus_minus
import kotlinx.android.synthetic.main.activity_third.point
import kotlinx.android.synthetic.main.activity_third.seven
import kotlinx.android.synthetic.main.activity_third.six
import kotlinx.android.synthetic.main.activity_third.tenglik
import kotlinx.android.synthetic.main.activity_third.three
import kotlinx.android.synthetic.main.activity_third.two
import kotlinx.android.synthetic.main.activity_third.zero

class Calc_math : AppCompatActivity(), View.OnClickListener {

    var numberText1:String? = null

    var number1:Double? = null
    var number2:Double? = null
    var number3:Int? = null
    var number4:Int? = null

    var ishora:String? = null
    var nuqta:String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_math)

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
        minus.setOnClickListener(this)
        div.setOnClickListener(this)
        multi.setOnClickListener(this)
        clear.setOnClickListener(this)
        plus_minus.setOnClickListener(this)
        point.setOnClickListener(this)
        per.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        val id = v?.id


        if (edit_calc.text.toString() == "0"){
            numberText1 = ""
        }

        when(id){

            R.id.point -> {
                if (!edit_calc.text.contains(".")) {
                    numberText1 += "."
                    edit_calc.setText(numberText1)
                    nuqta = "."
                } else {
                    Toast.makeText(this, "Nuqta qo'ygansiz !", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.per -> {
                if (numberText1 != "") {
                    if (!edit_calc.text.endsWith(".") && !edit_calc.text.endsWith(".") )      {
                        var aaa = numberText1?.toDouble()?.div(100)
                        numberText1 = aaa.toString()
                        edit_calc.setText(numberText1)
                    } else {
                        Toast.makeText(this, "To'g'ri kiriting", Toast.LENGTH_SHORT).show()
                    }
                    nuqta = "."
                } else {
                    Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.one -> {
                if (nuqta == ".") {
                    if (ishora == null) {
                        edit_calc.setText("")
                        numberText1 += "1"
                        edit_calc.setText(numberText1)
                    } else {
                        edit_calc.setText("")
                        numberText1 += "1"
                        edit_calc.setText(numberText1)
                    }
                } else {
                    if (nuqta == null) {
                        edit_calc.setText("")
                        numberText1 += "1"
                        edit_calc.setText(numberText1)
                    } else {
                        Toast.makeText(this, "Xatolik", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            R.id.two -> {
                edit_calc.setText("")
                numberText1 += "2"
                edit_calc.setText(numberText1)
            }
            R.id.three -> {
                edit_calc.setText("")
                numberText1 += "3"
                edit_calc.setText(numberText1)
            }
            R.id.four -> {
                edit_calc.setText("")
                numberText1 += "4"
                edit_calc.setText(numberText1)
            }
            R.id.five -> {
                edit_calc.setText("")
                numberText1 += "5"
                edit_calc.setText(numberText1)
            }
            R.id.six -> {
                edit_calc.setText("")
                numberText1 += "6"
                edit_calc.setText(numberText1)
            }
            R.id.seven -> {
                edit_calc.setText("")
                numberText1 += "7"
                edit_calc.setText(numberText1)
            }
            R.id.eight -> {
                edit_calc.setText("")
                numberText1 += "8"
                edit_calc.setText(numberText1)
            }
            R.id.nine -> {
                edit_calc.setText("")
                numberText1 += "9"
                edit_calc.setText(numberText1)
            }
            R.id.zero -> {
                edit_calc.setText("")
                numberText1 += "0"
                edit_calc.setText(numberText1)
            }
            R.id.plus_minus -> {
                if (numberText1 != "") {
                    if (!edit_calc.text.endsWith(".") && !edit_calc.text.startsWith(".")) {
                        if (!edit_calc.text.contains(".")) {
                            var q = numberText1?.toInt()?.times(-1).toString()
                            edit_calc.setText(q)
                            numberText1 = q
                        }else{
                            var q = numberText1?.toDouble()?.times(-1).toString()
                            edit_calc.setText(q)
                            numberText1 = q
                        }
                    } else {
                        Toast.makeText(this, "To'g'ri kiriting", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Son kiriting ?", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.plus_btn -> {
                if (nuqta == ".") {
                    if (numberText1 != "") {
                        if (!edit_calc.text.endsWith(".") && !edit_calc.text.startsWith(".")) {
                            number1 = numberText1?.toDouble()
                            numberText1 = ""
                            ishora = "+"
                            edit_calc.setText("+")
                        } else {
                            Toast.makeText(this, "To'g'ri kiriting", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    if (numberText1 != "") {
                        number3 = numberText1?.toInt()
                        numberText1 = ""
                        ishora = "+"
                        edit_calc.setText("+")
                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                    nuqta = null
                }
            }
            R.id.multi -> {
                if (nuqta == ".") {
                    if (numberText1 != "") {
                        if (!edit_calc.text.endsWith(".") && !edit_calc.text.startsWith(".")) {
                            number1 = numberText1?.toDouble()
                            numberText1 = ""
                            ishora = "*"
                            edit_calc.setText("*")
                        } else {
                            Toast.makeText(this, "To'g'ri kiriting", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    if (numberText1 != "") {
                        number3 = numberText1?.toInt()
                        numberText1 = ""
                        ishora = "*"
                        edit_calc.setText("*")
                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                    nuqta = null
                }
            }
            R.id.div -> {
                if (nuqta == ".") {
                    if (numberText1 != "") {
                        if (!edit_calc.text.endsWith(".") && !edit_calc.text.startsWith(".")) {
                            number1 = numberText1?.toDouble()
                            numberText1 = ""
                            ishora = "/"
                            edit_calc.setText("/")
                        } else {
                            Toast.makeText(this, "To'g'ri kiriting", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    if (numberText1 != "") {
                        number3 = numberText1?.toInt()
                        numberText1 = ""
                        ishora = "/"
                        edit_calc.setText("/")
                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            R.id.clear -> {
                edit_calc.setText("")
                numberText1 = ""
            }
            R.id.minus -> {
                if (nuqta == ".") {
                    if (numberText1 != "") {
                        if (!edit_calc.text.endsWith(".") && !edit_calc.text.startsWith(".")) {
                            number1 = numberText1?.toDouble()
                            numberText1 = ""
                            ishora = "-"
                            edit_calc.setText("-")
                        } else {
                            Toast.makeText(this, "To'g'ri kiriting", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    if (numberText1 != "") {
                        number3 = numberText1?.toInt()
                        numberText1 = ""
                        ishora = "-"
                        edit_calc.setText("-")

                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                    nuqta = null
                }
            }
            R.id.tenglik -> {
                if (nuqta == ".") {
                    if (numberText1 != "") {
                        if (!edit_calc.text.endsWith(".") && !edit_calc.text.startsWith(".")) {
                            number2 = numberText1?.toDouble()
                            if (ishora == "+") {
                                var result = number1?.plus(number2!!)
                                edit_calc.setText(result.toString())
                                ishora = ""
                                nuqta = null
                            } else {
                                if (ishora == "*") {
                                    var result = number1?.times(number2!!)
                                    edit_calc.setText(result.toString())
                                    ishora = ""
                                } else {
                                    if (ishora == "/") {
                                        var result = number1?.times(1.0)?.div(number2!!)
                                        edit_calc.setText(result.toString())
                                        ishora = ""
                                    } else {
                                        if (ishora == "-") {
                                            var result = number1?.minus(number2!!)
                                            edit_calc.setText(result.toString())
                                            ishora = ""
                                        } else {
                                            Toast.makeText(this, "Xato amal", Toast.LENGTH_SHORT).show()
                                            ishora = ""
                                        }
                                    }
                                }
                            }
                            numberText1 = ""
                        } else {
                            Toast.makeText(this, "To'g'ri kiriting", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    if (numberText1 != "") {
                        if (!edit_calc.text.endsWith(".") && !edit_calc.text.startsWith(".")) {
                            number4 = numberText1?.toInt()
                            if (ishora == "+") {
                                var result = number3?.plus(number4!!)
                                edit_calc.setText(result.toString())
                                ishora = ""
                            } else {
                                if (ishora == "*") {
                                    var result = number3?.times(number4!!)
                                    edit_calc.setText(result.toString())
                                    ishora = ""
                                } else {
                                    if (ishora == "/") {
                                        var result = number3?.times(1.0)?.div(number4!!)
                                        edit_calc.setText(result.toString())
                                        ishora = ""
                                    } else {
                                        if (ishora == "-") {
                                            var result = number3?.minus(number4!!)
                                            edit_calc.setText(result.toString())
                                            ishora = ""
                                        } else {
                                            Toast.makeText(this, "Xato amal", Toast.LENGTH_SHORT).show()
                                            ishora = ""
                                        }
                                    }
                                }
                            }
                            numberText1 = ""
                        } else {
                            Toast.makeText(this, "To'g'ri kiriting", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                }

            }
        }
    }
}