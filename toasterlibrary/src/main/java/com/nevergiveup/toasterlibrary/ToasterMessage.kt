package com.nevergiveup.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun s(context: Context, message: String, length: Int? = 1) {

        when (length) {
            Toast.LENGTH_SHORT -> Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }

    }
}