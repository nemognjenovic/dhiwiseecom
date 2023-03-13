package com.nemanjasapplication.app.modules.splash.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.base.BaseActivity
import com.nemanjasapplication.app.databinding.ActivitySplashBinding
import com.nemanjasapplication.app.modules.login.ui.LoginActivity
import com.nemanjasapplication.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
  private val viewModel: SplashVM by viewModels<SplashVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPLASH_ACTIVITY"

    }
  }
