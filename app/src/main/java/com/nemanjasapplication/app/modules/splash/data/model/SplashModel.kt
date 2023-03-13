package com.nemanjasapplication.app.modules.splash.`data`.model

import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShopsie: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopsie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThebestwayto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_best_way_to)

)
