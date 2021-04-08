package com.cantilever.aplicacion_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import kotlinx.android.synthetic.main.activity_calculadora.*

var resultado1 = "0"
var resultado2 = "0"
var is_Operated = false
var textSize = 5

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        unoValor()
        dosValor()
        tresValor()
        cuatroValor()
        cincoValor()
        seisValor()
        sieteValor()
        ochoValor()
        nueveValor()
    }

    private fun cambiarLabel(valor: String){
        resultado.setText(valor)
        if(resultado.text.toString().length%textSize==0){
            resultado.setTextSize(TypedValue.COMPLEX_UNIT_SP, resultado.textSize - resultado.textSize*0.8f);
        }
    }

    private fun unoValor(){
        btn_1.setOnClickListener(){
            resultado1 = resultado.text.toString() + "1"
            cambiarLabel(resultado1.toString())
        }
    }

    private fun dosValor(){
        btn_2.setOnClickListener(){
            resultado1 = resultado.text.toString() + "2"
            cambiarLabel(resultado1.toString())
        }
    }
    private fun tresValor(){
        btn_3.setOnClickListener(){
            resultado1 = resultado.text.toString() + "3"
            cambiarLabel(resultado1.toString())
        }
    }
    private fun cuatroValor(){
        btn_4.setOnClickListener(){
            resultado1 = resultado.text.toString() + "4"
            cambiarLabel(resultado1.toString())
        }
    }
    private fun cincoValor(){
        btn_5.setOnClickListener(){
            resultado1 = resultado.text.toString() + "5"
            cambiarLabel(resultado1.toString())
        }
    }
    private fun seisValor(){
        btn_6.setOnClickListener(){
            resultado1 = resultado.text.toString() + "6"
            cambiarLabel(resultado1.toString())
        }
    }
    private fun sieteValor(){
        btn_7.setOnClickListener(){
            resultado1 = resultado.text.toString() + "7"
            cambiarLabel(resultado1.toString())
        }
    }
    private fun ochoValor(){
        btn_8.setOnClickListener(){
            resultado1 = resultado.text.toString() + "8"
            cambiarLabel(resultado1.toString())
        }
    }
    private fun nueveValor(){
        btn_9.setOnClickListener(){
            resultado1 = resultado.text.toString() + "9"
            cambiarLabel(resultado1.toString())
        }
    }
    private fun dotValor(){
        btn_decimal.setOnClickListener(){
            resultado1 = resultado.text.toString() + "."
            cambiarLabel(resultado1.toString())
        }
    }


    private fun igualAccion(){
        btn_igual.setOnClickListener(){
            cambiarLabel((resultado1+resultado2).toString())
        }
    }



}