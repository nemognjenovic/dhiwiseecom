package com.nemanjasapplication.app.modules.productpage.`data`.model

import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShopsie: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopsie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrintMaxiDres: String? =
      MyApp.getInstance().resources.getString(R.string.msg_print_maxi_dres)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_99_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_product_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mini_dress_with)

)
