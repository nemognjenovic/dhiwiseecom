package com.nemanjasapplication.app.modules.productpage.ui

import android.net.Uri
import androidx.activity.viewModels
import com.nemanjasapplication.app.R
import com.nemanjasapplication.app.appcomponents.base.BaseActivity
import com.nemanjasapplication.app.databinding.ActivityProductPageBinding
import com.nemanjasapplication.app.modules.productpage.`data`.model.ImageSliderSliderrectangleelevenModel
import com.nemanjasapplication.app.modules.productpage.`data`.viewmodel.ProductPageVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ProductPageActivity : BaseActivity<ActivityProductPageBinding>(R.layout.activity_product_page)
    {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.nemanjasapplication.app/drawable/img_rectangle11")


  private val imageSliderSliderrectangleelevenItems:
      ArrayList<ImageSliderSliderrectangleelevenModel> =
      arrayListOf(ImageSliderSliderrectangleelevenModel(imageRectangleEleven =
  imageUri.toString()),ImageSliderSliderrectangleelevenModel(imageRectangleEleven =
  imageUri.toString()))


  private val viewModel: ProductPageVM by viewModels<ProductPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderrectangleelevenAdapter =
    SliderrectangleelevenAdapter(imageSliderSliderrectangleelevenItems,true)
    binding.imageSliderSliderrectangleeleven.adapter = sliderrectangleelevenAdapter
    binding.imageSliderSliderrectangleeleven.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorGroup5646.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup5646.updateIndicatorCounts(binding.imageSliderSliderrectangleeleven.indicatorCount)
    binding.productPageVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderrectangleeleven.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderrectangleeleven.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_PAGE_ACTIVITY"

  }
}
