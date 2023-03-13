package com.nemanjasapplication.app.modules.profileprofileinfo1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.base.BaseActivity
import com.nemanjasapplication.app.databinding.ActivityProfileProfileInfo1Binding
import com.nemanjasapplication.app.modules.profileprofileinfo1.`data`.viewmodel.ProfileProfileInfo1VM
import kotlin.String
import kotlin.Unit

class ProfileProfileInfo1Activity :
    BaseActivity<ActivityProfileProfileInfo1Binding>(R.layout.activity_profile_profile_info1) {
  private val viewModel: ProfileProfileInfo1VM by viewModels<ProfileProfileInfo1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileProfileInfo1VM = viewModel
    val adapter = ProfileProfileInfo1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup5706,binding.viewPagerViewpager) { tab, position ->
      tab.text = ProfileProfileInfo1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "PROFILE_PROFILE_INFO1ACTIVITY"

    }
  }
