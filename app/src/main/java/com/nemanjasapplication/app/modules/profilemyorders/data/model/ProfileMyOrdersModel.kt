package com.nemanjasapplication.app.modules.profilemyorders.`data`.model

import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileMyOrdersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrders: String? = MyApp.getInstance().resources.getString(R.string.lbl_orders)

)
