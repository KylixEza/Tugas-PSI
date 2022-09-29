package com.kylix.lk4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kylix.lk4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        val upComingClassAdapter = UpComingClassAdapter()
        val assignmentAdapter = AssignmentAdapter()
        
        binding.apply {
            rvUpcomingClass.adapter = upComingClassAdapter
            rvUpcomingClass.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            
            rvAssignment.adapter = assignmentAdapter
            rvAssignment.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            
            upComingClassAdapter.submitData(Dummy.getClasses())
            assignmentAdapter.submitData(Dummy.getAssignments())
        }
    }
}