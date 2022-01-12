package com.example.gpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            var c1 = editTextNumber.text.toString()
            var c2 = editTextNumber2.text.toString()
            var c3 = editTextNumber3.text.toString()
            var c4 = editTextNumber4.text.toString()
            var c5 = editTextNumber5.text.toString()
            var a1 = editTextNumber6.text.toString()
            var a2 = editTextNumber7.text.toString()
            var a3 = editTextNumber8.text.toString()
            var a4 = editTextNumber9.text.toString()
            var a5 = editTextNumber10.text.toString()
            if(c1 == ""|| c2 == ""|| c3 == ""|| c4 == ""|| c5 == ""|| a1 == ""|| a2 == ""|| a3 == ""|| a4 == ""|| a5 == ""|| editTextTextPersonName.text.isEmpty() || editTextTextPersonName2.text.isEmpty() || editTextTextPersonName3.text.isEmpty() || editTextTextPersonName4.text.isEmpty() || editTextTextPersonName5.text.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Plase Input All Text Box Before Press OK!!", Toast.LENGTH_SHORT).show()
            var w = c1.toInt() + c2.toInt() +  c3.toInt() +  c4.toInt() +  c5.toInt()
            textView16.text=w.toString()
            var Sum = 0.0
            Sum += (c1.toDouble() * a1.toDouble()) + (c2.toDouble() * a2.toDouble()) + (c3.toDouble() * a3.toDouble()) + (c4.toDouble() * a4.toDouble()) + (c5.toDouble() * a5.toDouble())
            textView17.text = String.format("%.2f",Sum/w )

        }
        button2.setOnClickListener{
            editTextTextPersonName.text.clear()
            editTextTextPersonName2.text.clear()
            editTextTextPersonName3.text.clear()
            editTextTextPersonName4.text.clear()
            editTextTextPersonName5.text.clear()
             editTextNumber.text.clear()
            editTextNumber2.text.clear()
           editTextNumber3.text.clear()
            editTextNumber4.text.clear()
            editTextNumber5.text.clear()
             editTextNumber6.text.clear()
            editTextNumber7.text.clear()
             editTextNumber8.text.clear()
            editTextNumber9.text.clear()
             editTextNumber10.text.clear()

            textView16.text=""
            textView17.text=""
        }

    }
}