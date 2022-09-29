package com.kylix.lk4

class AssignmentDiffUtil(
    private val oldList: List<AssignmentDTO>,
    private val newList: List<AssignmentDTO>
): BaseDiffUtil<AssignmentDTO, String>(oldList, newList) {
    override fun AssignmentDTO.getItemIdentifier(): String = subject
}

