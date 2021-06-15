package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentapp.MainBlankFragment
import com.example.fragmentapp.MainBlankFragment2
import com.example.fragmentapp.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportFragmentManager.beginTransaction()
            .add(R.id.container_a, MainBlankFragment())
            .add(R.id.container_b, MainBlankFragment2())
            .commit()
    }
}