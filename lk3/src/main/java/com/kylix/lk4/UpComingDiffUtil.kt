package com.kylix.lk4

class UpComingDiffUtil(
    private val oldList: List<ClassDTO>,
    private val newList: List<ClassDTO>
): BaseDiffUtil<ClassDTO, String>(oldList, newList) {
    override fun ClassDTO.getItemIdentifier(): String = subject
}