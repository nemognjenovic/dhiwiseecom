package com.nemanjasapplication.app.modules.cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nemanjasapplication.app.modules.cart.`data`.model.CartModel
import com.nemanjasapplication.app.modules.cart.`data`.model.CartRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CartVM : ViewModel(), KoinComponent {
  val cartModel: MutableLiveData<CartModel> = MutableLiveData(CartModel())

  var navArguments: Bundle? = null

  val cartList: MutableLiveData<MutableList<CartRowModel>> = MutableLiveData(mutableListOf())
}
