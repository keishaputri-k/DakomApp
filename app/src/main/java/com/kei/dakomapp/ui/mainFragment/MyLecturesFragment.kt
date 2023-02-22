package com.kei.dakomapp.ui.mainFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kei.dakomapp.R
import com.kei.dakomapp.adapter.LecturesAdapter
import com.kei.dakomapp.databinding.FragmentMyLecturesBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_my_lectures.*

@AndroidEntryPoint
class MyLecturesFragment : Fragment() {

//    private lateinit var myLecturesBinding: FragmentMyLecturesBinding
//    private lateinit var favoriteViewModel: FavoriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

       return  inflater.inflate(R.layout.fragment_my_lectures, container, false)
    }


//    private fun showRecyclerView() {
//        rvMyLectures.apply {
//            setHasFixedSize(true)
//            layoutManager = LinearLayoutManager(context)
//            adapter = LecturesAdapter(requireContext())
//        }
//    }

//   private fun observeData(){
//       val lecture = arguments?.getString(EXTRA_DATA)
//
//   }


    companion object {
        const val EXTRA_DATA = "extra_data"
        @JvmStatic
        fun newInstance() =
            MyLecturesFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}
