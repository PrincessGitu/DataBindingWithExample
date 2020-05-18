package com.sehajinfotech.databindingwithexample.adapter

import android.app.Activity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.sehajinfotech.databindingwithexample.R
import com.sehajinfotech.databindingwithexample.databinding.InputListBinding


/**
 * Created by Gitanjali Ghangale on 4/28/2020.
 */
class InputAdapter(val context: Activity, inputList: ArrayList<HashMap<String, String>>) :
    RecyclerView.Adapter<InputAdapter.InputViewHolder>() {


    var inputList1 = inputList

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InputViewHolder {


        val binding: InputListBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.getContext()),
            R.layout.input_list, parent, false
        )

        return InputViewHolder(binding)


    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return inputList1.size
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: InputViewHolder, position: Int) =
        holder.bind(inputList1[position])

    //the class is hodling the list view
    class InputViewHolder(var inputListBinding: InputListBinding) :
        ViewHolder(inputListBinding.root) {
        fun bind(item: HashMap<String, String>) {

            inputListBinding.name.text = item.get("feature_name")
            if (item.get("feature_status").equals("1")) {
                inputListBinding.status.text = "Coming Soon!"

            }
            Glide.with(inputListBinding.img).load(item.get("feature_img"))
                .into(inputListBinding.img)


        }

    }


}