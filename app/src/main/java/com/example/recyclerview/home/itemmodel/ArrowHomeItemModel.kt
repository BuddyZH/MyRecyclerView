package com.example.recyclerview.home.itemmodel

import com.example.recyclerview.home.HomeAdapter

class ArrowHomeItemModel : AbsHomeItemModel() {
    private var tag = 0
    private var dividerType = 0

    fun ArrowItemModel(tag: Int, dividerType: Int) { //tag may be data
        this.tag = tag
        this.dividerType = dividerType
    }

    override fun getType(): Int {
        return HomeAdapter.TYPE_ARROW
    }

    fun getTag(): Int {
        return tag
    }

    fun getDividerType(): Int {
        return dividerType
    }

    companion object{
        const val TAG_SETTING = 1
        const val TAG_ABOUT = 2


        const val DIVIDER_NULL = 1 //没有分割线
        const val DIVIDER_ONE = 2 //1dp的分割线
    }
}