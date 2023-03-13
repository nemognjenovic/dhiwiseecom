package com.nemanjasapplication.app.modules.productdiscover.`data`.model

import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class List1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPullBearExclu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pull_bear_exclu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_13_99)

)
