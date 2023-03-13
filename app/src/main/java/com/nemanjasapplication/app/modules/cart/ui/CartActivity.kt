package com.nemanjasapplication.app.modules.cart.ui

import android.view.View
import androidx.activity.viewModels
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.base.BaseActivity
import com.nemanjasapplication.app.databinding.ActivityCartBinding
import com.nemanjasapplication.app.modules.cart.`data`.model.CartRowModel
import com.nemanjasapplication.app.modules.cart.`data`.viewmodel.CartVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CartActivity : BaseActivity<ActivityCartBinding>(R.layout.activity_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val cartAdapter = CartAdapter(viewModel.cartList.value?:mutableListOf())
    binding.recyclerCart.adapter = cartAdapter
    cartAdapter.setOnItemClickListener(
    object : CartAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CartRowModel) {
        onClickRecyclerCart(view, position, item)
      }
    }
    )
    viewModel.cartList.observe(this) {
      cartAdapter.updateData(it)
    }
    binding.cartVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerCart(
    view: View,
    position: Int,
    item: CartRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CART_ACTIVITY"

  }
}
