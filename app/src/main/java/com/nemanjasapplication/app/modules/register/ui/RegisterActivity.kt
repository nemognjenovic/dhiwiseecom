package com.nemanjasapplication.app.modules.register.ui

import android.content.Intent
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.base.BaseActivity
import com.nemanjasapplication.app.appcomponents.facebookauth.FacebookHelper
import com.nemanjasapplication.app.appcomponents.googleauth.GoogleHelper
import com.nemanjasapplication.app.databinding.ActivityRegisterBinding
import com.nemanjasapplication.app.modules.register.`data`.viewmodel.RegisterVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(R.layout.activity_register) {
  private val viewModel: RegisterVM by viewModels<RegisterVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageFacebook.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.imageGoogle.setOnClickListener {
          googleLogin.login()
        }
      }

      companion object {
        const val TAG: String = "REGISTER_ACTIVITY"

      }
    }
