package com.example.parkirfinal4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
    }
    // Function to handle button click
    fun goToNextPage(view: View) {
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }
}