package com.kylix.lk6

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.kylix.lk6.base.BaseRecyclerViewAdapter
import com.kylix.lk6.databinding.ItemListHeroBinding

class HeroAdapter: BaseRecyclerViewAdapter<ItemListHeroBinding, Hero>() {
    override fun inflateViewBinding(parent: ViewGroup): ItemListHeroBinding =
        ItemListHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    
    override val binder: (Hero, ItemListHeroBinding) -> Unit = { data, binding ->
        binding.apply {
            tvName.text = data.name
            tvDescription.text = data.description
            Glide.with(itemView.context)
                .load(data.photo)
                .circleCrop()
                .into(ivHero)
            
            ivHero.setOnClickListener {
                Toast.makeText(itemView.context, data.name, Toast.LENGTH_SHORT).show()
            }
        }
    }
    
    override val diffUtilBuilder: (List<Hero>, List<Hero>) -> DiffUtil.Callback = { old, new ->
        HeroDiffUtil(old, new)
    }
}