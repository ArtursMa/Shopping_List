package com.example.shoppinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.shoppinglist.R
import com.example.shoppinglist.data.ShopApplication


class MainActivity : AppCompatActivity() {
    private val mainScreenViewModel:MainScreenViewModel by viewModels{
        MainScreenViewModel.MainScreenProviderFactory((application as ShopApplication).repository )


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainScreenViewModel.allShopListItems.observe(this, Observer { Log.i("shopList",it.toString()) })


    }
}