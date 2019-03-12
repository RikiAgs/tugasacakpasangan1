package com.rikiagstya.prob

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.text = "Les't Go"
        btn1.setOnClickListener {
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }
        btn1.setOnClickListener {
            kocokWajah()
        }
    }

    private fun kocokWajah() {
        val randomCewe = Random().nextInt(6) + 1
        val randomCowo = Random().nextInt(4) + 1
        val drawableCewe = when (randomCewe) {
            1 -> R.drawable.fuji
            2 -> R.drawable.citra
            3 -> R.drawable.ayulest
            4 -> R.drawable.mela
            5 -> R.drawable.hanum
            else -> R.drawable.lis
        }
        val drawableCowo = when (randomCowo) {
            1 -> R.drawable.riki
            2 -> R.drawable.adytya
            3 -> R.drawable.edi
            else -> R.drawable.iav
        }
        cewe.setImageResource(drawableCewe)
        cowo.setImageResource(drawableCowo)
    }
}
