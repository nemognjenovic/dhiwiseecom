package com.nemanjasapplication.app.modules.mainlanding.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.databinding.RowMainLanding1Binding
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.MainLanding1RowModel
import kotlin.Int
import kotlin.collections.List

class MainLanding1Adapter(
  var list: List<MainLanding1RowModel>
) : RecyclerView.Adapter<MainLanding1Adapter.RowMainLanding1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMainLanding1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_main_landing1,parent,false)
    return RowMainLanding1VH(view)
  }

  override fun onBindViewHolder(holder: RowMainLanding1VH, position: Int) {
    val mainLanding1RowModel = MainLanding1RowModel()
    // TODO uncomment following line after integration with data source
    // val mainLanding1RowModel = list[position]
    holder.binding.mainLanding1RowModel = mainLanding1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MainLanding1RowModel>) {
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
      item: MainLanding1RowModel
    ) {
    }
  }

  inner class RowMainLanding1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMainLanding1Binding = RowMainLanding1Binding.bind(itemView)
  }
}
