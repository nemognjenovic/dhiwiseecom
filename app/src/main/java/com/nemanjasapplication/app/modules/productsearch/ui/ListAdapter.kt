package com.nemanjasapplication.app.modules.productsearch.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.databinding.RowListBinding
import com.nemanjasapplication.app.modules.productsearch.`data`.model.ListRowModel
import kotlin.Int
import kotlin.collections.List

class ListAdapter(
  var list: List<ListRowModel>
) : RecyclerView.Adapter<ListAdapter.RowListVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_list,parent,false)
    return RowListVH(view)
  }

  override fun onBindViewHolder(holder: RowListVH, position: Int) {
    val listRowModel = ListRowModel()
    // TODO uncomment following line after integration with data source
    // val listRowModel = list[position]
    holder.binding.listRowModel = listRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListRowModel
    ) {
    }
  }

  inner class RowListVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListBinding = RowListBinding.bind(itemView)
  }
}
