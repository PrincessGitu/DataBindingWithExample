package com.sehajinfotech.databindingwithexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sehajinfotech.databindingwithexample.adapter.SectionAdapter
import com.sehajinfotech.databindingwithexample.databinding.ActivityMainBinding
import com.sehajinfotech.databindingwithexample.model.Section
import com.sehajinfotech.databindingwithexample.viewModel.SectionViewModel
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    //First Code on Github
    var sectionViewModel: SectionViewModel? = null
    var adapter: SectionAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

     //  val  sectionViewModel1:SectionViewModel=ViewModelProviders.of(this).get(SectionViewModel::class.java) // Deprecated
        sectionViewModel = ViewModelProvider(this).get(SectionViewModel::class.java)

        val recyclerView:RecyclerView
        recyclerView=binding.recycleSection

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        adapter = SectionAdapter( this@MainActivity)
        recyclerView.adapter=adapter
        getAllSect()
    }

    fun getAllSect(){
        sectionViewModel!!.getSecData().observe(this,
            Observer<List<Section>> { sec -> adapter!!.setSectionList(sec as ArrayList<Section>) })


    }
}
