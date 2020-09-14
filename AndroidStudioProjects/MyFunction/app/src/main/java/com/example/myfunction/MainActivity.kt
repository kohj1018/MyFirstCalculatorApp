package com.example.myfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var new_ope = true
    var old_num = ""
    var num = ""
    var operation = "^"

    var do_not_repeat = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /***
     * 고병욱/ICT융합학부/2020053954
     ***/

    fun numberEvent(view: View) {
        var test_zero_repeat = textView.text.toString()
        if (new_ope)
            textView.setText("")
        new_ope = false

        var txt = textView.text.toString()
        var selectBtn = view as Button
        when (selectBtn.id) {
            oneBtn.id -> {txt += "1"}
            twoBtn.id -> {txt += "2"}
            threeBtn.id -> {txt += "3"}
            fourBtn.id -> {txt += "4"}
            fiveBtn.id -> {txt += "5"}
            sixBtn.id -> {txt += "6"}
            sevenBtn.id -> {txt += "7"}
            eightBtn.id -> {txt += "8"}
            nineBtn.id -> {txt += "9"}
            zeroBtn.id -> {
                if (test_zero_repeat == "0") {
                    new_ope = true
                    txt = "0"
                } else {
                    txt += "0"
                }
            }
            pmBtn.id -> {
                if (txt == "") {
                    txt = "-"
                } else if ( !( txt.contains("-") ) ) {
                    txt = "-${txt}"
                } else if ( ( txt.contains("-") ) ) {
                    var len = txt.length
                    var ran = IntRange(1,len-1)
                    txt = txt.slice(ran)
                }
            }
            dotBtn.id -> {
                if (txt == "") {
                    txt = "0."
                } else if ( !( txt.contains(".") ) ) {
                    txt += "."
                }
            }
        }
        textView.setText(txt)
        do_not_repeat = true
    }

    fun operatorEvent(view: View) {
        new_ope = true
        num = textView.text.toString()
        var selectBtn = view as Button
        if (do_not_repeat) {
            when (selectBtn.id) {
                pluBtn.id -> {
                    when (operation) {
                        "+" -> {
                            var sum = old_num.toDouble() + num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "-" -> {
                            var sum = old_num.toDouble() - num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "*" -> {
                            var sum = old_num.toDouble() * num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "/" -> {
                            var sum = old_num.toDouble() / num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                    }
                    operation = "+"
                    do_not_repeat = false
                }
                minBtn.id -> {
                    when (operation) {
                        "+" -> {
                            var sum = old_num.toDouble() + num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "-" -> {
                            var sum = old_num.toDouble() - num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "*" -> {
                            var sum = old_num.toDouble() * num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "/" -> {
                            var sum = old_num.toDouble() / num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                    }
                    operation = "-"
                    do_not_repeat = false
                }
                mulBtn.id -> {
                    when (operation) {
                        "+" -> {
                            var sum = old_num.toDouble() + num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "-" -> {
                            var sum = old_num.toDouble() - num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "*" -> {
                            var sum = old_num.toDouble() * num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "/" -> {
                            var sum = old_num.toDouble() / num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                    }
                    operation = "*"
                    do_not_repeat = false
                }
                divBtn.id -> {
                    when (operation) {
                        "+" -> {
                            var sum = old_num.toDouble() + num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "-" -> {
                            var sum = old_num.toDouble() - num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "*" -> {
                            var sum = old_num.toDouble() * num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "/" -> {
                            var sum = old_num.toDouble() / num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                    }
                    operation = "/"
                    do_not_repeat = false
                }
                equBtn.id -> {
                    when (operation) {
                        "+" -> {
                            var sum = old_num.toDouble() + num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "-" -> {
                            var sum = old_num.toDouble() - num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "*" -> {
                            var sum = old_num.toDouble() * num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                        "/" -> {
                            var sum = old_num.toDouble() / num.toDouble()

                            var len = sum.toString().length
                            var ran = IntRange(len-2,len-1)
                            if (sum.toString().slice(ran) == ".0") {
                                var ran2 = IntRange(0,len-3)
                                var slice_sum = sum.toString().slice(ran2)
                                textView.setText(slice_sum)
                            } else {
                                textView.setText(sum.toString())
                            }
                        }
                    }
                    operation = "^"
                }
            }
        } else {
            textView.setText(textView.text.toString())
        }
        old_num = textView.text.toString()
    }

    fun acEvent(view: View) {
        new_ope = true
        operation = "^"
        old_num = ""
        num = ""
        textView.setText("0")
    }

    fun percentEvent(view: View) {
        new_ope = true
        var percent_sum = textView.text.toString().toDouble()/100
        textView.setText(percent_sum.toString())
    }
}