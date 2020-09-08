package com.example.recyclerview.home

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.AbsRecyclerAdapter
import com.example.recyclerview.home.itemmodel.AbsHomeItemModel
import com.example.recyclerview.home.viewholder.AbsHomeRecyclerViewHolder
import com.example.recyclerview.home.viewholder.ArrowViewHolder
import com.example.recyclerview.home.viewholder.HeaderViewHolder
import java.util.*

class HomeAdapter(context: Context?) : AbsRecyclerAdapter<RecyclerView.ViewHolder>(context) {
    private val mModelList: MutableList<AbsHomeItemModel>? = ArrayList<AbsHomeItemModel>()

    fun updateList(list: List<AbsHomeItemModel>?) {
        if (mModelList == null) {
            return
        }
        mModelList.clear()
        mModelList.addAll(list!!)
        notifyDataSetChanged()
    }

    companion object {
        private const val TAG = "HomeAdapter"
        const val TYPE_HEADER = 1 //头部item
        const val TYPE_ARROW = 2 //有箭头item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder: RecyclerView.ViewHolder
        viewHolder = when (viewType) {
            TYPE_HEADER -> HeaderViewHolder.createVH(getInflater()!!, parent)
            TYPE_ARROW -> ArrowViewHolder.createVH(getInflater()!!, parent)
            else -> throw IllegalArgumentException("unknown viewType $viewType")
        }!!
        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: AbsHomeItemModel = mModelList!![position] ?: return
        val viewHolder: AbsHomeRecyclerViewHolder<AbsHomeItemModel> = holder as AbsHomeRecyclerViewHolder<AbsHomeItemModel>
        viewHolder.onBindViewHolder(model)
    }

    override fun getItemCount(): Int {
        return mModelList!!.size
    }

    override fun getItemViewType(position: Int): Int {
        return mModelList!![position].getType()
    }
}