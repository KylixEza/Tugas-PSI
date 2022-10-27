package com.kylix.lk6

import androidx.recyclerview.widget.LinearLayoutManager
import com.kylix.lk6.base.BaseActivity
import com.kylix.lk6.base.ScreenOrientation
import com.kylix.lk6.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    
    override fun inflateViewBinding(): ActivityMainBinding =
        ActivityMainBinding.inflate(layoutInflater)
    
    override fun determineScreenOrientation(): ScreenOrientation = ScreenOrientation.PORTRAIT
    
    override fun ActivityMainBinding.binder() {
        val heroAdapter = HeroAdapter()
        
        rvHeroe.apply {
            adapter = heroAdapter
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
        
        heroAdapter.submitList(Dummy.getHeroes())
    }
}