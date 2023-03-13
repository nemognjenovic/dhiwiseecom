package com.nemanjasapplication.app.modules.mainlanding.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.MainLanding1RowModel
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.MainLandingModel
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.MainLandingRowModel
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.SpinnerGenderModel
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.SpinnerGroup5732Model
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.SpinnerGroup5732OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MainLandingVM : ViewModel(), KoinComponent {
  val mainLandingModel: MutableLiveData<MainLandingModel> = MutableLiveData(MainLandingModel())

  var navArguments: Bundle? = null

  val spinnerGenderList: MutableLiveData<MutableList<SpinnerGenderModel>> = MutableLiveData()

  val spinnerGroup5732List: MutableLiveData<MutableList<SpinnerGroup5732Model>> = MutableLiveData()

  val spinnerGroup5732OneList: MutableLiveData<MutableList<SpinnerGroup5732OneModel>> =
      MutableLiveData()

  val mainLandingList: MutableLiveData<MutableList<MainLandingRowModel>> =
      MutableLiveData(mutableListOf())

  val mainLanding1List: MutableLiveData<MutableList<MainLanding1RowModel>> =
      MutableLiveData(mutableListOf())
}
