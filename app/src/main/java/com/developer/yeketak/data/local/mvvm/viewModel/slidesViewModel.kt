package com.developer.yeketak.data.local.mvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.developer.yeketak.data.local.mvvm.repository.slidesRepository
import com.developer.yeketak.data.remote.dto.SlidesDataDTO
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class slidesViewModel @Inject constructor(
    private val slidesRepository: slidesRepository
): ViewModel() {

    var slidesList = MutableLiveData<List<SlidesDataDTO>>()

    init {
        slidesList = slidesRepository.getSlidesListLiveData()
    }

    fun getSlides() {
        slidesRepository.getSlides()
    }

}