package com.lucassimoesmartins.delegatetest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val context: Context by lazy {
        this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUI()
    }

    //TESTE 1 Delegate com Interface (Object Expression)

//    private fun setUI() {
//        btnHello.setOnClickListener {
//            val myDialog = MyDialog(context)
//            myDialog.configDialog(object : MyDelegate{
//                override fun delegate(myText: String) {
//                    funcMain(myText)
//                }
//
//            })
//        }
//    }
//
//    private fun funcMain(myText: String) {
//        Toast.makeText(context, "MAIN + $myText", Toast.LENGTH_SHORT).show()
//    }


    //Teste 2 Delegate com HOF (Lambda)

//    private fun setUI() {
//        btnHello.setOnClickListener {
//            funcMain("teste") {
//                Toast.makeText(context, it, Toast.LENGTH_LONG).show()
//            }
//        }
//    }
//
//    private fun funcMain(myText: String, hof : (txt: String) -> Unit) {
//
//        //Codigo aqui
//
//        hof("$myText + Higher order functions")
//    }


    //Teste 3 Delegate com HOF em outra classe (Lambda)

    private fun setUI() {
        btnHello.setOnClickListener {
            val myDialog = MyDialog(context)
            myDialog.configDialog {
                funcMain(it)
            }
        }
    }

    private fun funcMain(myText: String) {
        Toast.makeText(context, "MAIN + $myText", Toast.LENGTH_SHORT).show()
    }

}
