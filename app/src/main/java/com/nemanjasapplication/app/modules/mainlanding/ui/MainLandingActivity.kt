package com.nemanjasapplication.app.modules.mainlanding.ui

import android.view.View
import androidx.activity.viewModels
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.base.BaseActivity
import com.nemanjasapplication.app.databinding.ActivityMainLandingBinding
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.MainLanding1RowModel
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.MainLandingRowModel
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.SpinnerGenderModel
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.SpinnerGroup5732Model
import com.nemanjasapplication.app.modules.mainlanding.`data`.model.SpinnerGroup5732OneModel
import com.nemanjasapplication.app.modules.mainlanding.`data`.viewmodel.MainLandingVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MainLandingActivity : BaseActivity<ActivityMainLandingBinding>(R.layout.activity_main_landing)
    {
  private val viewModel: MainLandingVM by viewModels<MainLandingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGenderList.value = mutableListOf(
    SpinnerGenderModel("Item1"),
    SpinnerGenderModel("Item2"),
    SpinnerGenderModel("Item3"),
    SpinnerGenderModel("Item4"),
    SpinnerGenderModel("Item5")
    )
    val spinnerGenderAdapter =
    SpinnerGenderAdapter(this,R.layout.spinner_item,viewModel.spinnerGenderList.value?:
    mutableListOf())
    binding.spinnerGender.adapter = spinnerGenderAdapter
    viewModel.spinnerGroup5732List.value = mutableListOf(
    SpinnerGroup5732Model("Item1"),
    SpinnerGroup5732Model("Item2"),
    SpinnerGroup5732Model("Item3"),
    SpinnerGroup5732Model("Item4"),
    SpinnerGroup5732Model("Item5")
    )
    val spinnerGroup5732Adapter =
    SpinnerGroup5732Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup5732List.value?:
    mutableListOf())
    binding.spinnerGroup5732.adapter = spinnerGroup5732Adapter
    viewModel.spinnerGroup5732OneList.value = mutableListOf(
    SpinnerGroup5732OneModel("Item1"),
    SpinnerGroup5732OneModel("Item2"),
    SpinnerGroup5732OneModel("Item3"),
    SpinnerGroup5732OneModel("Item4"),
    SpinnerGroup5732OneModel("Item5")
    )
    val spinnerGroup5732OneAdapter =
    SpinnerGroup5732OneAdapter(this,R.layout.spinner_item,viewModel.spinnerGroup5732OneList.value?:
    mutableListOf())
    binding.spinnerGroup5732One.adapter = spinnerGroup5732OneAdapter
    val mainLandingAdapter =
    MainLandingAdapter(viewModel.mainLandingList.value?:mutableListOf())
    binding.recyclerMainLanding.adapter = mainLandingAdapter
    mainLandingAdapter.setOnItemClickListener(
    object : MainLandingAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MainLandingRowModel) {
        onClickRecyclerMainLanding(view, position, item)
      }
    }
    )
    viewModel.mainLandingList.observe(this) {
      mainLandingAdapter.updateData(it)
    }
    val mainLanding1Adapter =
    MainLanding1Adapter(viewModel.mainLanding1List.value?:mutableListOf())
    binding.recyclerMainLanding1.adapter = mainLanding1Adapter
    mainLanding1Adapter.setOnItemClickListener(
    object : MainLanding1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MainLanding1RowModel) {
        onClickRecyclerMainLanding1(view, position, item)
      }
    }
    )
    viewModel.mainLanding1List.observe(this) {
      mainLanding1Adapter.updateData(it)
    }
    binding.mainLandingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMainLanding(
    view: View,
    position: Int,
    item: MainLandingRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerMainLanding1(
    view: View,
    position: Int,
    item: MainLanding1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MAIN_LANDING_ACTIVITY"

  }
}
