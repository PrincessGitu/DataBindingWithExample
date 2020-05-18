package com.sehajinfotech.databindingwithexample.model


import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sehajinfotech.databindingwithexample.R

/**
 * Created by Gitanjali Ghangale on 4/28/2020.
 */
class Section {


    constructor(
        sec_id: String?,
        sec_name: String?,
        avatar: String?,
        feature_id: String?,
        feature_name: String?,
        feature_status: String?,
        feature_img: String?
    ) {
        this.sec_id = sec_id
        this.sec_name = sec_name
        this.avatar = avatar
        this.feature_id = feature_id
        this.feature_name = feature_name
        this.feature_status = feature_status
        this.feature_img = feature_img
    }

    constructor(
        sec_id: String?,
        sec_name: String?,
        avatar: String?,
        feature_id: String?,
        feature_name: String?,
        feature_status: String?,
        feature_img: String?,
        menu_items: ArrayList<HashMap<String, String>>?
    ) {
        this.sec_id = sec_id
        this.sec_name = sec_name
        this.avatar = avatar
        this.feature_id = feature_id
        this.feature_name = feature_name
        this.feature_status = feature_status
        this.feature_img = feature_img
        this.menu_items = menu_items
    }

    constructor() {

    }

    var sec_id: String? = null
    var sec_name: String? = null
    var avatar: String? = null
    var feature_id: String? = null
    var feature_name: String? = null
    var feature_status: String? = null
    var feature_img: String? = null
    var menu_items: ArrayList<HashMap<String, String>>? = null


}