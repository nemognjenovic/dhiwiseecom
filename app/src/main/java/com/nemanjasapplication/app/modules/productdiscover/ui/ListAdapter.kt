package com.nemanjasapplication.app.modules.productdiscover.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.databinding.RowList1Binding
import com.nemanjasapplication.app.modules.productdiscover.`data`.model.List1RowModel
import kotlin.Int
import kotlin.collections.List

class ListAdapter(
  var list: List<List1RowModel>
) : RecyclerView.Adapter<ListAdapter.RowList1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowList1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_list1,parent,false)
    return RowList1VH(view)
  }

  override fun onBindViewHolder(holder: RowList1VH, position: Int) {
    val list1RowModel = List1RowModel()
    // TODO uncomment following line after integration with data source
    // val list1RowModel = list[position]
    holder.binding.list1RowModel = list1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<List1RowModel>) {
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
      item: List1RowModel
    ) {
    }
  }

  inner class RowList1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowList1Binding = RowList1Binding.bind(itemView)
  }
}
