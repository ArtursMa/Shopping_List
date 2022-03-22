package com.example.shoppinglist.domain

import kotlinx.coroutines.flow.Flow

class GetShopItem(private val repository: ShopItemRepository) {
  suspend  fun getShopItem( id:Int): Flow<List<ShopListItem>> {
       return repository.getItemById(id)



    }
}