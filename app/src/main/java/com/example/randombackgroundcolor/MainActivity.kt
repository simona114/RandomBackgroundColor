package com.example.randombackgroundcolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.util.concurrent.ThreadLocalRandom

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      var btn =   findViewById<Button>(R.id.btnChangeBackgroundColor)
        btn.setOnClickListener {

            var colors = listOf<Int>(Color.CYAN, Color.GREEN, Color.MAGENTA, Color.RED, Color.YELLOW, Color.BLACK, )
            var res =  ThreadLocalRandom.current().nextInt(0, colors.size)

            findViewById<View>(R.id. mainView).setBackgroundColor(colors[res])
        }
    }
}