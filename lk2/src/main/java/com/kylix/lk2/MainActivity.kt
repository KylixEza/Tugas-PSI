package com.kylix.lk2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kylix.lk2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = "MainActivity Lifecycle"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        Log.i(TAG, "onCreate")
    }
    
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }
    
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }
    
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }
    
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }
    
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }
    
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }
}