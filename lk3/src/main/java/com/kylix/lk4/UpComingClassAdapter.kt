package com.kylix.lk4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.kylix.lk4.databinding.ItemListUpcomingClassBinding

class UpComingClassAdapter: BaseRecyclerViewAdapter<ItemListUpcomingClassBinding, ClassDTO>() {
    override fun inflateViewBinding(parent: ViewGroup): ItemListUpcomingClassBinding =
        ItemListUpcomingClassBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    
    override val binder: (ClassDTO, ItemListUpcomingClassBinding) -> Unit = { data, binding ->
        binding.apply {
            tvSubject.text = data.subject
            tvChapter.text = data.chapter
            tvTeacher.text = data.teacher
            tvTime.text = "${data.date} | ${data.time}"
        }
    }
    
    override val diffUtilBuilder: (List<ClassDTO>, List<ClassDTO>) -> DiffUtil.Callback = { oldList, newList ->
        UpComingDiffUtil(oldList, newList)
    }
}