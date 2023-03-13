package com.nemanjasapplication.app.modules.profileaddressdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nemanjasapplication.app.modules.profileaddressdetails.`data`.model.ListhomeaddressRowModel
import com.nemanjasapplication.app.modules.profileaddressdetails.`data`.model.ProfileAddressDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileAddressDetailsVM : ViewModel(), KoinComponent {
  val profileAddressDetailsModel: MutableLiveData<ProfileAddressDetailsModel> =
      MutableLiveData(ProfileAddressDetailsModel())

  var navArguments: Bundle? = null

  val listhomeaddressList: MutableLiveData<MutableList<ListhomeaddressRowModel>> =
      MutableLiveData(mutableListOf())
}
