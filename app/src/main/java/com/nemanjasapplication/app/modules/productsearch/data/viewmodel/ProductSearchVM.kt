package com.nemanjasapplication.app.modules.productsearch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nemanjasapplication.app.modules.productsearch.`data`.model.ListRowModel
import com.nemanjasapplication.app.modules.productsearch.`data`.model.ProductSearchModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProductSearchVM : ViewModel(), KoinComponent {
  val productSearchModel: MutableLiveData<ProductSearchModel> =
      MutableLiveData(ProductSearchModel())

  var navArguments: Bundle? = null

  val listList: MutableLiveData<MutableList<ListRowModel>> = MutableLiveData(mutableListOf())
}
