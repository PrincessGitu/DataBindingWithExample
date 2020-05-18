package com.sehajinfotech.databindingwithexample.adapter

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.sehajinfotech.databindingwithexample.R
import com.sehajinfotech.databindingwithexample.databinding.SectionListBinding
import com.sehajinfotech.databindingwithexample.model.Section
import kotlin.collections.ArrayList
/**
 * Created by Gitanjali Ghangale on 4/28/2020.
 */
class SectionAdapter(val context: Activity) :RecyclerView.Adapter<SectionAdapter.SectionViewHolder>() {


    var sectionList1 = ArrayList<Section>()

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionViewHolder {


        val binding: SectionListBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
            R.layout.section_list, parent, false)

        return SectionViewHolder(binding)


    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
       return sectionList1.size
    }

    //this method is binding the data on the list
   // override fun onBindViewHolder(holder: SectionViewHolder, position: Int) =holder.bind(sectionList1[position])
    override fun onBindViewHolder(holder: SectionViewHolder, position: Int) {
        val currentInput: Section = sectionList1.get(position)
        holder.sectionListBinding.setSection(currentInput)

        val recyclerView:RecyclerView=holder.sectionListBinding.recyclerInput
        recyclerView.layoutManager= LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        val adapter = InputAdapter( context,currentInput.menu_items!!)
        recyclerView.adapter = adapter
        val manager = GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = manager
    }




    fun setSectionList(sectionList: ArrayList<Section>) {
        Log.e("sectionList","="+sectionList.size)
        sectionList1=sectionList
        notifyDataSetChanged()
    }

    //the class is hodling the list view
      class SectionViewHolder(var sectionListBinding: SectionListBinding) : ViewHolder(sectionListBinding.root){

        fun bind(item: Section) {
            Log.e("name","="+item.sec_name)
            sectionListBinding.textView.text=item.sec_name

        }

    }


}