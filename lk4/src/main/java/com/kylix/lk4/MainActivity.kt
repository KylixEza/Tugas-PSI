package com.kylix.lk4

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import androidx.annotation.RequiresApi
import androidx.core.widget.addTextChangedListener
import com.gdsc.gdsctoast.GDSCToast.Companion.showAnyToast
import com.kylix.lk4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private var counter = 0
    
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.includeAvailableClass.btnJoin.apply {
            setOnClickListener {
                Log.d("TAG", "onCreate: Button Join Clicked")
                showAnyToast {
                    it.text = "Join Button Clicked"
                }
                text = "${counter++}"
            }
            
            setOnLongClickListener {
                Log.d("TAG", "onCreate: Button Join Long Clicked")
                showAnyToast {
                    it.text = "Join Button Long Clicked"
                }
                text = "${counter++}"
                true
            }
            
            addTextChangedListener {
                Log.d("TAG", "onCreate: Button Join Text Changed")
                showAnyToast {
                    it.text = "Join Button Text Changed"
                }
            }
        }
        
    }
}