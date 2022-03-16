package com.example.shoppinglist.domain

import kotlinx.coroutines.flow.Flow

interface ShopItemRepository {
    fun getListOfItems():Flow<List<ShopListItem>>
    suspend fun addItem(item:ShopListItem)
    fun getItemById(id:Int):Flow<List<ShopListItem>>
    suspend fun deleteItem(item:ShopListItem)
    suspend fun editItem(item:ShopListItem)

}