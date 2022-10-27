package com.kylix.lk6

import com.kylix.lk6.base.BaseDiffUtil

class HeroDiffUtil(
    oldList: List<Hero>,
    newList: List<Hero>
): BaseDiffUtil<Hero, String>(oldList, newList) {
    override fun Hero.getItemIdentifier(): String = name
}
