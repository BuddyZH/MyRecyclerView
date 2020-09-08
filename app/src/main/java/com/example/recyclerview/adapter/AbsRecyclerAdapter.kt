package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView

abstract class AbsRecyclerAdapter<VH : RecyclerView.ViewHolder?>(context: Context?) :
    RecyclerView.Adapter<VH>() {

    private var mContext: Context? = context
    private var mInflater: LayoutInflater? = null

    init {
        mInflater = LayoutInflater.from(context)
    }

    protected open fun getInflater(): LayoutInflater? {
        return mInflater
    }

    protected open fun getContext(): Context? {
        return mContext
    }

    protected open fun getString(resId: Int): String? {
        return getContext()!!.getString(resId)
    }
}