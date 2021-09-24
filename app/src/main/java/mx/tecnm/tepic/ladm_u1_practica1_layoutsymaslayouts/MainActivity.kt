package mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    var lista : ListView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lista = findViewById(R.id.menuprincipal)
        lista!!.setOnItemClickListener { parent, view, objetoSeleccionado, id ->
            when(objetoSeleccionado){
                0 -> {
                    //1 surf
                    //Main3Activity
                    var activity3 = Intent(this,MainActivity3::class.java)
                    startActivity(activity3)
                }
                1 -> {
                    var activity2 = Intent(this,MainActivity2::class.java)
                    startActivity(activity2)
                }
                2 -> {
                    //3
                    var activity4 = Intent(this,MainActivity4::class.java)
                    startActivity(activity4)
                }
                3 -> {
                    //4
                    //Main4Activity
                    var activity5 = Intent(this,MainActivity5::class.java)
                    startActivity(activity5)
                }
                4 -> {
                    //5
                    //Main4Activity
                    var activity6 = Intent(this,MainActivity6::class.java)
                    startActivity(activity6)
                }

                5 -> {
                    //5
                    //Main4Activity
                    var activity7 = Intent(this,MainActivity7::class.java)
                    startActivity(activity7)
                }

                6 -> {
                    //5
                    //Main4Activity
                    var activity8 = Intent(this,MainActivity8::class.java)
                    startActivity(activity8)
                }
                7 -> {
                    //5
                    //Main4Activity
                    var activity9 = Intent(this,MainActivity9::class.java)
                    startActivity(activity9)
                }
                8 -> {
                    //5
                    //Main4Activity
                    //Acerca de
                    AlertDialog.Builder(this)
                        .setTitle("Acerca de...")
                        .setMessage("(C) Mahomedalidla 2021")
                        .show()
                }

                else -> {
                    //default
                    finish()
                }
            }
        }
    }
}