package com.example.shoppinglist.data

import androidx.room.*
import com.example.shoppinglist.domain.ShopListItem
import kotlinx.coroutines.flow.Flow

@Dao
interface ShopListDAO {
@Query("SELECT * FROM shoplistitem")
fun getAllShopItems():Flow<List<ShopListItem>>

@Query("SELECT * FROM shoplistitem WHERE id =:id")
fun getItemsById(id:Int):Flow<List<ShopListItem>>

@Insert(onConflict = OnConflictStrategy.IGNORE)
suspend fun addItem(item:ShopListItem)

@Delete
suspend fun deleteItem(item:ShopListItem)

@Update
suspend fun editItem(item:ShopListItem)


}