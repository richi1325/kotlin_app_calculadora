package com.cantilever.aplicacion_1

import Service.MyIntentService
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val HILOUNO = 1
const val HILODOS = 2
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val servicio = Intent(this,MyIntentService::class.java)
        //servicio.putExtra("type", HILOUNO)
        startService(servicio)

        //val servicio2 = Intent(this,MyIntentService::class.java)
        //servicio2.putExtra("type", HILODOS)
        //startService(servicio2)

        temperatura()
        divisas()


        //ejemplo()
        //numerosPrimos()
        //println("El factorial del numero 10 es: ${factorial(10)}")

    }

    private fun temperatura(){
        btn_temp.setOnClickListener(){
            val intent = Intent(this,Temperatura::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun divisas(){
        btn_divisas.setOnClickListener(){
            val intent = Intent(this,Calculadora::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun ejemplo() {
        val teste : String = "-----------------Testeo-----------------------"
        println(teste)
        val a=5
        val b=7
        val c=9
        if(a>b && b>c){
            println("$a>$b>$c")
        }
        else if(a>c && c>b){
            println("$a>$c>$b")
        }
        else if(b>a && a>c){
            println("$b>$a>$c")
        }
        else if(b>c && c>a){
            println("$b>$c>$a")
        }
        else if(c>a && a>b){
            println("$c>$a>$b")
        }
        else{
            println("$c>$b>$a")
        }

    }

    private fun numerosPrimos(){
        var contador=0
        for(i in 2..99){
            contador=0
            for(j in 2..i){
                if(i%j==0){
                    contador++
                }
            }
            if(contador==1){
                println("El numero $i es primo")
            }
        }
    }
    private fun factorial(numero:Int) : Int{
        var valor=1
        if(numero==1){
            return 1
        }
        valor=(factorial(numero-1)*numero)
        return valor
    }
}