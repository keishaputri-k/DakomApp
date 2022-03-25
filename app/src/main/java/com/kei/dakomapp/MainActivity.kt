package com.kei.dakomapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.kei.dakomapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){
    private  lateinit var  mainBinding: ActivityMainBinding

    companion object {
        fun getLaunchService (from: Context) = Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        supportActionBar?.hide()

        addFragment(HomeFragment.newInstance())
        mainBinding.bnvMain.show(0)
        mainBinding.bnvMain.add(MeowBottomNavigation.Model(0,R.drawable.ic_my_lecture))
        mainBinding.bnvMain.add(MeowBottomNavigation.Model(1,R.drawable.ic_discovery))
        mainBinding.bnvMain.add(MeowBottomNavigation.Model(2,R.drawable.ic_home))
        mainBinding.bnvMain.add(MeowBottomNavigation.Model(3,R.drawable.ic_profile))

        mainBinding.bnvMain.setOnClickMenuListener {
            when(it.id) {
                0 -> {
                    replaceFragment(MyLecturesFragment.newInstance())
                }
                1 -> {
                    replaceFragment(HomeFragment.newInstance()) //discovery
                }
                2 -> {
                    replaceFragment(HomeFragment.newInstance())
                }
                3 -> {
                    replaceFragment(ProfileFragment.newInstance())
                }
                else -> {
                    replaceFragment(HomeFragment.newInstance())
                }
            }
        }
    }

    private fun replaceFragment(fragment:Fragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragmentContainer,fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }

    private fun addFragment(fragment:Fragment){
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.add(R.id.fragmentContainer,fragment).addToBackStack(Fragment::class.java.simpleName).commit()
    }
}
