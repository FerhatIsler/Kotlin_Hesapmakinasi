package com.ferhatisler.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ferhatisler.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var x : Double? = null
    var y  : Double? = null
    var result : Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }


    fun topla(view: View) {

         x = binding.number1.text.toString().toDoubleOrNull()
         y = binding.number2.text.toString().toDoubleOrNull()

        if (x != null && y != null){
             result = x!! + y!!
            binding.textView.text = "result ${result}"
        }else{
            binding.textView.text = "Numara gir"
        }
        }
    fun cıkar(view: View) {
        x = binding.number1.text.toString().toDoubleOrNull()
        y = binding.number2.text.toString().toDoubleOrNull()

        if (x != null && y != null){
            result = x!! - y!!
            binding.textView.text = "result ${result}"
        }else{
            binding.textView.text = "Numara gir"
        }
    }
    fun carp(view: View) {
        x = binding.number1.text.toString().toDoubleOrNull()
        y = binding.number2.text.toString().toDoubleOrNull()

        if (x != null && y != null){
            result = x!! * y!!
            binding.textView.text = "result ${result}"
        }else{
            binding.textView.text = "Numara gir"
        }
    }
    fun bol(view: View) {
        x = binding.number1.text.toString().toDoubleOrNull()
        y = binding.number2.text.toString().toDoubleOrNull()

        if (x != null && y != null){
            result = x!! / y!!
            binding.textView.text = "result ${result}"
        }else{
            binding.textView.text = "Numara gir"
        }
    }

}