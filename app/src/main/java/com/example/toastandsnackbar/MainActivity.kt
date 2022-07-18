package com.example.toastandsnackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSnackbar.setOnClickListener {
            val csToast = findViewById<LinearLayout>(R.id.ll_toast)
            val layout = layoutInflater.inflate(R.layout.custom_toast, csToast)
            val snackbar = Snackbar.make(binding.root, "Dingin", Snackbar.LENGTH_INDEFINITE)
            snackbar.setActionTextColor(Color.BLUE)
            snackbar.setTextColor(Color.BLACK)
            snackbar.view.setBackgroundColor(Color.CYAN)
            snackbar.setAction("pencet") {
                with(Toast(applicationContext)) {
                    duration = Toast.LENGTH_SHORT
                    view = layout
                    show()
                }
            }.show()
        }


        binding.btnToast.setOnClickListener {
            showCustomToast()
        }
    }

    private fun showCustomToast() {
        val csToast = findViewById<LinearLayout>(R.id.ll_toast)
        val layout = layoutInflater.inflate(R.layout.custom_toast, csToast)

        with(Toast(applicationContext)) {
            duration = Toast.LENGTH_SHORT
            view = layout
            show()
        }
    }
}