package com.example.recyclerview.adapter

import android.content.Context
import android.content.res.Resources
import android.view.View
import androidx.recyclerview.widget.RecyclerView

public abstract class AbsRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    init {
        //todo ButterKnife.bind(this, itemView)
    }

    protected fun getContext(): Context {
        return itemView.context
    }

    protected fun getString(id: Int): String {
        return getContext().getString(id)
    }

    protected fun getResource(): Resources {
        return getContext().resources
    }
}