package com.example.recyclerview.home.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerview.R
import com.example.recyclerview.home.itemmodel.HeaderItemModel

class HeaderViewHolder(itemView: View): AbsHomeRecyclerViewHolder<HeaderItemModel>(itemView) {

    override fun onBindViewHolder(model: HeaderItemModel) {
        //show view by data
    }

    companion object {
        fun createVH(mInflate: LayoutInflater, parent: ViewGroup?): HeaderViewHolder {
            return HeaderViewHolder(mInflate.inflate(R.layout.home_list_item_header, parent, false))
        }
    }
}