package com.example.recyclerview.home.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerview.R
import com.example.recyclerview.home.itemmodel.ArrowHomeItemModel
import com.example.recyclerview.home.itemmodel.ArrowHomeItemModel.Companion.DIVIDER_NULL
import com.example.recyclerview.home.itemmodel.ArrowHomeItemModel.Companion.TAG_SETTING

class ArrowViewHolder(itemView : View): AbsHomeRecyclerViewHolder<ArrowHomeItemModel>(itemView) {

    override fun onBindViewHolder(model: ArrowHomeItemModel) {
        when(model.getDividerType()){
            DIVIDER_NULL -> "" // TODO show view
            //...
        }
        when(model.getTag()) {
            TAG_SETTING -> "" // TODO show view by data
            //...
        }
    }

    //set onclick

    companion object {
        fun createVH(mInflate: LayoutInflater, parent: ViewGroup?): ArrowViewHolder? {
            return ArrowViewHolder(mInflate.inflate(R.layout.home_list_item_arrow, parent, false))
        }
    }
}