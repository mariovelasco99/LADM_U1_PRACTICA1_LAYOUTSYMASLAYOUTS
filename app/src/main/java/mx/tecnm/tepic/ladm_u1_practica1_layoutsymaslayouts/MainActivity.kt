package mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuprincipal.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0->{
                    var activity2 = Intent(this, MainActivity2::class.java)
                    startActivity(activity2)
                }
                1->{
                    var activity3 = Intent(this, MainActivity3::class.java)
                    startActivity(activity3)
                }
                2->{
                    var activity4 = Intent(this, MainActivity4::class.java)
                    startActivity(activity4)
                }
                3->{
                    var activity5 = Intent(this, MainActivity5::class.java)
                    startActivity(activity5)
                }
                4->{
                    var activity6 = Intent(this, MainActivity6::class.java)
                    startActivity(activity6)
                }
                5->{
                    var activity7 = Intent(this, MainActivity7::class.java)
                    startActivity(activity7)
                }
                6->{
                    var activity8 = Intent(this, MainActivity8::class.java)
                    startActivity(activity8)
                }
                7->{
                    var activity9 = Intent(this, MainActivity9::class.java)
                    startActivity(activity9)
                }
                8->{
                    finish()
                }
            }
        }
    }
}