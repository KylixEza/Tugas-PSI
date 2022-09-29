package com.kylix.lk4

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DiffUtil
import com.kylix.lk4.databinding.ItemListAssignmentBinding

class AssignmentAdapter: BaseRecyclerViewAdapter<ItemListAssignmentBinding, AssignmentDTO>() {
    override fun inflateViewBinding(parent: ViewGroup): ItemListAssignmentBinding =
        ItemListAssignmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    
    @RequiresApi(Build.VERSION_CODES.M)
    override val binder: (AssignmentDTO, ItemListAssignmentBinding) -> Unit = { data, binding ->
        binding.apply {
            tvTitle.text = data.title
            tvSubject.text = data.subject
            tvDescription.text = data.description
            tvDaysLeft.text = "${data.dueDate} Days Left"
            
            if (data.dueDate <= 1) {
                tvDaysLeft.setTextColor(itemView.context.getColor(R.color.red_700))
            } else {
                tvDaysLeft.setTextColor(itemView.context.getColor(R.color.secondary_200))
            }
        }
    }
    
    override val diffUtilBuilder: (List<AssignmentDTO>, List<AssignmentDTO>) -> DiffUtil.Callback = { oldList, newList ->
        AssignmentDiffUtil(oldList, newList)
    }
}