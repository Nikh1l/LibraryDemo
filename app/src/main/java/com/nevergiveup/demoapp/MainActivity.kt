package com.nevergiveup.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nevergiveup.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {

    private val toastMessage: ToasterMessage = ToasterMessage()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toastMessage.s(
            this,
            "This is a toast message",
            Toast.LENGTH_LONG
        )

    }
}