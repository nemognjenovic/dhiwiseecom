package com.nemanjasapplication.app.modules.profilesecurity.ui

import androidx.fragment.app.viewModels
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.base.BaseFragment
import com.nemanjasapplication.app.databinding.FragmentProfileSecurityBinding
import com.nemanjasapplication.app.modules.profilesecurity.`data`.viewmodel.ProfileSecurityVM
import kotlin.String
import kotlin.Unit

class ProfileSecurityFragment :
    BaseFragment<FragmentProfileSecurityBinding>(R.layout.fragment_profile_security) {
  private val viewModel: ProfileSecurityVM by viewModels<ProfileSecurityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileSecurityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_SECURITY_FRAGMENT"

  }
}
