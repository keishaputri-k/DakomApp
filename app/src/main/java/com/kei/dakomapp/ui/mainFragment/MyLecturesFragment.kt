package com.kei.dakomapp.ui.mainFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kei.dakomapp.R

class MyLecturesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_lectures, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MyLecturesFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}
