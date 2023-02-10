package kr.co.bullets.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // SAM
        // Single Abstract Method
        val view = View(this)

//        view.setOnClickListener(
//            new View.OnClickListener() {
//                @Override
//                pulic void onClick(view: View) {
//
//                }
//            }
//        )

        view.setOnClickListener({ println("안녕") })
        view.setOnClickListener { println("안녕") }
    }
}