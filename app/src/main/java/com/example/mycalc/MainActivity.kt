package com.example.mycalc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycalc.ui.theme.MyCalcTheme

class MainActivity : ComponentActivity() {

    private var tvInput: TextView? = null
    var lastNumeric : Boolean  = false
    var lastDot : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)


    }

    fun onDigit(view: View){
        tvInput?.append((view as Button) .text)
        lastNumeric = true
        lastDot = false
    }

    fun onCLear(view: View) {
        tvInput?.text = ""
    }

    fun onDecimalPoint(view: View) {
        if(lastNumeric && !lastDot) {
            tvInput?.append(".")
            lastNumeric = false;
            lastDot = true;
        }
    }

}
