package com.nemanjasapplication.app.modules.profileaddressdetails.`data`.model

import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListhomeaddressRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeaddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_home_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressCounterTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_address_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_amoy_st_592)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_address_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_amoy_st_592)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLosAngeles: String? = MyApp.getInstance().resources.getString(R.string.lbl_los_angeles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCityOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0000000: String? = MyApp.getInstance().resources.getString(R.string.lbl_0000000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPostalcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_postal_code2)

)
