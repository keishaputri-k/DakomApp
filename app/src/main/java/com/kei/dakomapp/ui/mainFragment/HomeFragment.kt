package com.kei.dakomapp.ui.mainFragment
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kei.dakomapp.R
import com.kei.dakomapp.ui.discoveryFragments.DiscoveryActivity
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(), View.OnClickListener{

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivDiscoveryHome.setOnClickListener(this)

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {}
            }
    }

    override fun onClick(p0: View) {
        when(p0.id) {
            R.id.ivDiscoveryHome -> moveDiscovery()
        }
    }

    private fun moveDiscovery() {
        val intent = Intent(activity, DiscoveryActivity::class.java)
        activity?.startActivity(intent)
    }


}