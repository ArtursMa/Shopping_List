package com.example.shoppinglist.domain

class AddShopItem(private val repository: ShopItemRepository) {
    fun addItem( item:ShopListItem){
        repository.addItem(item)


    }
}