package com.sehajinfotech.databindingwithexample.util

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.sehajinfotech.databindingwithexample.model.Section
import com.sehajinfotech.employeeapp.utils.VolleySingleton
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by Gitanjali Ghangale on 4/28/2020.
 */
class SectionRepository {

    val groupList = ArrayList<Section>()
    val mutableLiveData = MutableLiveData<List<Section>>()

    fun getMutableLiveSecData(): MutableLiveData<List<Section>> {
        val data = "{\n" +
                "  \"page\": 1,\n" +
                "  \"per_page\": 3,\n" +
                "  \"total\": 12,\n" +
                "  \"total_pages\": 4,\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "       \"sec_name\": \"Announcements\",\n" +
                "       \"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\",\n" +
                "\t  \"input\":[\n" +
                "\t   \n" +
                "\t   ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "       \"sec_name\": \"Member\",\n" +
                "       \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\",\n" +
                "\t  \"input\":[\n" +
                "\t   {\n" +
                "\t   \"feature_id\": 1,\n" +
                "       \"feature_name\": \"Document\",\n" +
                "       \"feature_status\": \"1\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        },\n" +
                "\t\t {\n" +
                "\t   \"feature_id\": 2,\n" +
                "       \"feature_name\": \"Payment\",\n" +
                "       \"feature_status\": \"1\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        },\n" +
                "\t\t {\n" +
                "\t   \"feature_id\": 3,\n" +
                "       \"feature_name\": \"Paymnet History\",\n" +
                "       \"feature_status\": \"0\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        },\n" +
                "\t\t {\n" +
                "\t   \"feature_id\": 4,\n" +
                "       \"feature_name\": \"Help Desk\",\n" +
                "       \"feature_status\": \"0\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        },\n" +
                "\t\t {\n" +
                "\t   \"feature_id\": 5,\n" +
                "       \"feature_name\": \"My Visitor\",\n" +
                "       \"feature_status\": \"0\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        },\n" +
                "\t\t {\n" +
                "\t   \"feature_id\": 6,\n" +
                "       \"feature_name\": \"Daily Help\",\n" +
                "       \"feature_status\": \"0\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        }\n" +
                "\t   ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 3,\n" +
                "\t   \"sec_name\": \"BHIM UPI\",\n" +
                "       \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg\",\n" +
                "\t  \"input\":[\n" +
                "\t  {\n" +
                "\t   \"feature_id\": 1,\n" +
                "       \"feature_name\": \"Scan & Pay\",\n" +
                "       \"feature_status\": \"1\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        },\n" +
                "\t\t {\n" +
                "\t   \"feature_id\": 2,\n" +
                "       \"feature_name\": \"Send Payment\",\n" +
                "       \"feature_status\": \"0\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        },\n" +
                "\t\t {\n" +
                "\t   \"feature_id\": 3,\n" +
                "       \"feature_name\": \"Request Paymnet\",\n" +
                "       \"feature_status\": \"0\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        },\n" +
                "\t\t {\n" +
                "\t   \"feature_id\": 4,\n" +
                "       \"feature_name\": \"Online Paymnet\",\n" +
                "       \"feature_status\": \"0\",\n" +
                "       \"feature_img\": \"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"\n" +
                "        }\n" +
                "\t  \n" +
                "\t  ]\n" +
                "    },  {\n" +
                "      \"id\": 4,\n" +
                "      \"sec_name\": \"Property Management\",\n" +
                "      \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg\",\n" +
                "\t  \"input\":[\n" +
                "\t \n" +
                "\t  ]\n" +
                "    },  {\n" +
                "      \"id\": 5,\n" +
                "     \"sec_name\": \"Upcoming Bill\",\n" +
                "      \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg\",\n" +
                "\t  \"input\":[\n" +
                "\t \n" +
                "\t  \n" +
                "\t  ]\n" +
                "    }\n" +
                "  ]\n" +
                "}"


        try {


            groupList.clear()
            val jsonObject = JSONObject(data)
            val jsonArray = jsonObject.getJSONArray("data")
            if (jsonArray.length() > 0) {
                for (i in 0 until jsonArray.length()) {
                    val jObj = jsonArray.getJSONObject(i)
                    val secObj = Section()
                    secObj.sec_id = jObj.getString("id")
                    secObj.avatar = jObj.getString("avatar")
                    secObj.sec_name = jObj.getString("sec_name")

                    val jsonArray1 = jObj.getJSONArray("input")
                    val menu_items = ArrayList<HashMap<String, String>>()
                    if (jsonArray1.length() > 0) {
                        for (j in 0 until jsonArray1.length()) {
                            val jObj1 = jsonArray1.getJSONObject(j)
                            val hash_menu_items = HashMap<String, String>()
                            hash_menu_items.put("feature_id", jObj1.getString("feature_id"))
                            hash_menu_items.put("feature_name", jObj1.getString("feature_name"))
                            hash_menu_items.put("feature_status", jObj1.getString("feature_status"))
                            hash_menu_items.put("feature_img", jObj1.getString("feature_img"))
                            menu_items.add(hash_menu_items)
                        }
                        secObj.menu_items = menu_items
                    } else {
                        secObj.menu_items = menu_items
                    }

                    groupList.add(secObj)

                }

                mutableLiveData.value = groupList
                Log.e("groupList","="+groupList.size)
            }

        } catch (e: Exception) {
            e.printStackTrace();
        }
        Log.e("mutableLiveData","="+mutableLiveData.value)
        return mutableLiveData
    }



    private fun getStats() {

        val url="https://covid-19-data.p.rapidapi.com/country/all?format=json"
        //creating volley string request
        val stringRequest = object : StringRequest(
            Request.Method.GET,url,
            Response.Listener<String> { response ->
                try {
                    Log.e("response", response)
                    val obj = JSONArray(response)

                    if (obj.length() > 0) {
                        for (i in 0 until obj.length()) {
                            val jsonObject1 = obj.getJSONObject(i)
                            val country = jsonObject1.getString("country")
                            val confirmed = jsonObject1.getString("confirmed")
                            val recovered = jsonObject1.getString("recovered")
                            val critical = jsonObject1.getString("critical")
                            val deaths = jsonObject1.getString("deaths")
                            val latitude = jsonObject1.getString("latitude")
                            val longitude = jsonObject1.getString("longitude")
                            val lastChange = jsonObject1.getString("lastChange")
                            val lastUpdate = jsonObject1.getString("lastUpdate")

                            Log.e("country","="+country);

                        }
                    }


                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            },
            Response.ErrorListener { volleyError ->

            }) {
            override fun getHeaders(): Map<String, String> {
                val params = HashMap<String, String>()
                params.put("x-rapidapi-host", "covid-19-data.p.rapidapi.com")
                params.put("x-rapidapi-key", "0904b15f55msh1c1552b93e3040bp12b225jsn9b2c9499dd6b")

                return params
            }
        }

        //adding request to queue
        VolleySingleton.instance?.addToRequestQueue(stringRequest)
    }
}
