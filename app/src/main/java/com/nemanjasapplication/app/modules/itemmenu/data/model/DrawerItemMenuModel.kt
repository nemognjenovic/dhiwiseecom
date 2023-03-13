package com.nemanjasapplication.app.modules.itemmenu.`data`.model

import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCART: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPROFILE: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClothing: String? = MyApp.getInstance().resources.getString(R.string.lbl_clothing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_shoes)

)
