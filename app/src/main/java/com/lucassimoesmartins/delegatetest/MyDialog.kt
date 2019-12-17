package com.lucassimoesmartins.delegatetest

import android.app.Dialog
import android.content.Context
import android.view.Window
import android.widget.Button
import android.widget.Toast

class MyDialog(
    private val context: Context
) {

    //TESTE 1 Delegate com Interface

//    fun configDialog(myDelegate: MyDelegate) {
//        val dialog = Dialog(context)
//        val btn1: Button
//        val btn2: Button
//
//        with(dialog) {
//            requestWindowFeature(Window.FEATURE_NO_TITLE)
//            setCancelable(false)
//            setContentView(R.layout.cutsom_layout)
//
//            btn1 = findViewById(R.id.btn1)
//            btn2 = findViewById(R.id.btn2)
//
//            btn1.setOnClickListener {
//                myDelegate.delegate("btn1 click")
//            }
//
//            btn2.setOnClickListener {
//                myDelegate.delegate("btn2 click")
//            }
//
//            show()
//        }
//
//    }


    //Teste 3 Delegate com HOF em outra classe

    fun configDialog(hof : (texto : String) -> Unit) {
        val dialog = Dialog(context)
        val btn1: Button
        val btn2: Button

        with(dialog) {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setCancelable(false)
            setContentView(R.layout.cutsom_layout)

            btn1 = findViewById(R.id.btn1)
            btn2 = findViewById(R.id.btn2)

            btn1.setOnClickListener {
                hof("HOF em dialog 1")
            }

            btn2.setOnClickListener {
                hof("HOF em dialog 2")
            }

            show()
        }

    }

}