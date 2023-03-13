package com.nemanjasapplication.app.modules.productdiscover.ui

import android.view.View
import androidx.activity.viewModels
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.base.BaseActivity
import com.nemanjasapplication.app.databinding.ActivityProductDiscoverBinding
import com.nemanjasapplication.app.modules.productdiscover.`data`.model.List1RowModel
import com.nemanjasapplication.app.modules.productdiscover.`data`.viewmodel.ProductDiscoverVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProductDiscoverActivity :
    BaseActivity<ActivityProductDiscoverBinding>(R.layout.activity_product_discover) {
  private val viewModel: ProductDiscoverVM by viewModels<ProductDiscoverVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listAdapter = ListAdapter(viewModel.listList.value?:mutableListOf())
    binding.recyclerList.adapter = listAdapter
    listAdapter.setOnItemClickListener(
    object : ListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : List1RowModel) {
        onClickRecyclerList(view, position, item)
      }
    }
    )
    viewModel.listList.observe(this) {
      listAdapter.updateData(it)
    }
    binding.productDiscoverVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerList(
    view: View,
    position: Int,
    item: List1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_DISCOVER_ACTIVITY"

  }
}
