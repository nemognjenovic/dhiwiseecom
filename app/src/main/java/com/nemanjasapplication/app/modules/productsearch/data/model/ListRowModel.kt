package com.nemanjasapplication.app.modules.productsearch.`data`.model

import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSliders: String? = MyApp.getInstance().resources.getString(R.string.lbl_sliders2)

)
