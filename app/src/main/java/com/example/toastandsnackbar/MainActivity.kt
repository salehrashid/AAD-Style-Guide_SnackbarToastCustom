package com.example.toastandsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
            val snackbar = Snackbar.make(binding.root, "dihapus", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("undo") {
                Snackbar.make(binding.root, "berhasil dipulihkan", Snackbar.LENGTH_LONG).show()
            }.show()
        }

        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "it's Toast", Toast.LENGTH_SHORT).show()
        }
    }
}