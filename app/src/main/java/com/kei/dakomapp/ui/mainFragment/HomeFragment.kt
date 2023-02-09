package com.kei.dakomapp.ui.mainFragment

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewConfiguration
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.kei.dakomapp.R
import com.kei.dakomapp.adapter.LecturesAdapter
import com.kei.dakomapp.model.ResponseLectures
import com.kei.dakomapp.ui.discoveryFragments.DiscoveryActivity
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var lecturesAdapter: LecturesAdapter
    private lateinit var rvLecture: RecyclerView

    companion object {
        fun defaultFragment(): HomeFragment {
            val home_fragment = HomeFragment()
            //ngirim ke oncreate
            val bundle = Bundle()
            //arguments default function u ngirim data
            home_fragment.arguments = bundle
            return home_fragment
        }

        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {}
            }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        var v: View = inflater.inflate(R.layout.fragment_home, container, false)

        rvLecture = v.findViewById(R.id.rvPopularHome)
        // Inflate the layout for this fragment
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivDiscoveryHome.setOnClickListener(this)

        GetDatas()

    }

    private fun GetDatas() {
        var loading = ProgressDialog.show(context, "Request Data", "Loading..")
        (
                object : Callback<ResponseLectures> {
                    override fun onResponse(call: Call<ResponseLectures>, response: Response<ResponseLectures>){
                        loading.dismiss()
                        Log.d("DATA", "hide loading")
                        if (response.isSuccessful) {
                            val data = response.body()

                            Log.d("DATA", "success")
                            if (data?.status == "success") {
                                Log.d("DATA", "200")
                                if (!data.lecture.isNullOrEmpty()) {
                                    Log.d("DATA", "ADA")
                                    Log.d("DATA", Gson().toJson(data.lecture))
                                    lecturesAdapter.setData(data.lecture)
                                }
                            }
                        }
                    }

                    override fun onFailure(call: Call<ResponseLectures>, t: Throwable) {
                        Log.d("Response", "Failed : " + t.localizedMessage)
                        loading.dismiss()
                    }
                }
                )
    }


    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.ivDiscoveryHome -> moveDiscovery()
        }
    }

    private fun moveDiscovery() {
        val intent = Intent(activity, DiscoveryActivity::class.java)
        activity?.startActivity(intent)
    }


}