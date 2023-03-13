package com.nemanjasapplication.app.modules.mainlanding.`data`.model

import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MainLanding1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_43_90)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCottonblackdr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cotton_black_dr)

)
