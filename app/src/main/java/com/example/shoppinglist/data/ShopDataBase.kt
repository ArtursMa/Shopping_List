package com.example.shoppinglist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.shoppinglist.domain.ShopListItem
import kotlinx.coroutines.CoroutineScope

@Database(entities = arrayOf(ShopListItem::class),version = 1,exportSchema = false)
abstract class ShopDataBase:RoomDatabase() {
    abstract fun shopListDAO():ShopListDAO

  companion object{
      @Volatile
      private var INSTANCE: ShopDataBase? = null
      fun getDataBaseInstance(context: Context,coroutineScope: CoroutineScope):ShopDataBase{
          return INSTANCE?: synchronized(this){
              var instance = Room.databaseBuilder(context.applicationContext,
              ShopDataBase::class.java,"shop_db").build()
          INSTANCE = instance
         return  instance

          }

      }
  }

}