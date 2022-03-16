package com.example.shoppinglist.data

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class ShopApplication:Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
    val dataBase by lazy { ShopDataBase.getDataBaseInstance(this,applicationScope) }
    val repository by lazy { ShopListRepoImpl(dataBase.shopListDAO()) }


}