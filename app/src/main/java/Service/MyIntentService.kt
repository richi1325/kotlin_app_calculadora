package Service

import android.app.IntentService
import android.content.Intent
import android.util.Log
import com.cantilever.aplicacion_1.HILODOS
import com.cantilever.aplicacion_1.HILOUNO

class MyIntentService:IntentService("MyIntentService"){

    override fun onHandleIntent(intent: Intent?) {
        for(i in 1..5){
            Log.d("MyIntentService","Servicio haciendo algo $i")
            Thread.sleep(1000)
        }
//        when(intent?.getBooleanExtra()){
//            HILOUNO -> for(i in 1..5){
//                Log.d("MyIntentService","Servicio haciendo algo $i")
//                Thread.sleep(1000)
//            }
//            HILODOS -> for(i in 1..5){
//                Log.d("MyIntentService","Servicio haciendo algo $i")
//                Thread.sleep(1000)
//            }
//        }

    }
}