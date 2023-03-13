package com.nemanjasapplication.app.modules.cart.`data`.model

import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShopsie: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopsie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMYCART: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSUBTOTAL: String? = MyApp.getInstance().resources.getString(R.string.lbl_sub_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_111_80)

)
