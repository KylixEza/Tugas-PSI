package com.kylix.lk4

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import androidx.annotation.RequiresApi
import com.gdsc.gdsctoast.GDSCToast.Companion.showAnyToast
import com.kylix.lk4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
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
            }
            
            setOnLongClickListener {
                Log.d("TAG", "onCreate: Button Join Long Clicked")
                showAnyToast {
                    it.text = "Join Button Long Clicked"
                }
                true
            }
            
            /*setOnFocusChangeListener { view, b ->
                Log.d("TAG", "onCreate: Button Join Focus Changed")
                showAnyToast {
                    it.text = "Join Button Focus Changed"
                }
            }*/
            
            setOnKeyListener { view, i, keyEvent ->
                when(keyEvent.action) {
                    KeyEvent.ACTION_DOWN -> {
                        Log.d("TAG", "onCreate: Button Join Key Down")
                        showAnyToast {
                            it.text = "Join Button Key Down"
                        }
                    }
                    KeyEvent.ACTION_UP -> {
                        Log.d("TAG", "onCreate: Button Join Key Up")
                        showAnyToast {
                            it.text = "Join Button Key Up"
                        }
                    }
                    KeyEvent.FLAG_KEEP_TOUCH_MODE -> {
                        Log.d("TAG", "Button Join Key Keep Touch Mode")
                        showAnyToast {
                            it.text = "Join Button Key Keep Touch Mode"
                        }
                    }
                }
                true
            }
            
            /*setOnTouchListener { view, motionEvent ->
                when(motionEvent.actionButton) {
                    MotionEvent.ACTION_BUTTON_PRESS -> {
                        Log.d("TAG", "onCreate: Button Join Pressed")
                        showAnyToast {
                            it.text = "Join Button Pressed"
                        }
                    }
                    MotionEvent.ACTION_BUTTON_RELEASE -> {
                        Log.d("TAG", "onCreate: Button Join Released")
                        showAnyToast {
                            it.text = "Join Button Released"
                        }
                    }
                    MotionEvent.ACTION
                }
                true
            }*/
        }
        
    }
}