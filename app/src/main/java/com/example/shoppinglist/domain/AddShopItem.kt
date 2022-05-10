package com.example.shoppinglist.domain

class AddShopItem(private val repository: ShopItemRepository) {
  suspend    fun addItem( item:ShopListItem){
        repository.addItem(item)


    }
}