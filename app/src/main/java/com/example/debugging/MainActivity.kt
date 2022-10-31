package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        division()
        Log.i(TAG, "onResume started.")
    }

    private fun division() {
        val numerator = 60
        var denominator = 4
        repeat(4) {
            Thread.sleep(3000)
            Log.d(TAG, "Text ${findViewById<TextView>(R.id.division_TextView).text} was replaced by ${numerator / denominator}")
            findViewById<TextView>(R.id.division_TextView).text = "${numerator / denominator}"
            denominator--
        }
    }
}