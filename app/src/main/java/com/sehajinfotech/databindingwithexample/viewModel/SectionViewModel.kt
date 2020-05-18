package com.sehajinfotech.databindingwithexample.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sehajinfotech.databindingwithexample.model.Section
import com.sehajinfotech.databindingwithexample.util.SectionRepository
import kotlin.collections.ArrayList

/**
 * Created by Gitanjali Ghangale on 4/28/2020.
 */
class  SectionViewModel(application: Application) : AndroidViewModel(application) {

    val repository=SectionRepository()

    //constructor(application: Application) : super(application)

    fun getSecData(): LiveData<List<Section>> {
        Log.e("repository","="+repository.getMutableLiveSecData().value)
        return repository.getMutableLiveSecData()
    }



}