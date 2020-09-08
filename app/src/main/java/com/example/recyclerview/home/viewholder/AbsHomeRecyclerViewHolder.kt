package com.example.recyclerview.home.viewholder

import android.view.View
import com.example.recyclerview.adapter.AbsRecyclerViewHolder
import com.example.recyclerview.home.itemmodel.AbsHomeItemModel

abstract class AbsHomeRecyclerViewHolder<T : AbsHomeItemModel?>(itemView: View) : AbsRecyclerViewHolder(itemView) {

    abstract fun onBindViewHolder(model: T)
}