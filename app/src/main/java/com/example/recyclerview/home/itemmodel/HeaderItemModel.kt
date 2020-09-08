package com.example.recyclerview.home.itemmodel

import com.example.recyclerview.home.HomeAdapter

public class HeaderItemModel : AbsHomeItemModel() {
    override fun getType(): Int {
        return HomeAdapter.TYPE_HEADER
    }
}