package com.example.shoppinglist.domain

class DeleteShopItem(private val repository: ShopItemRepository) {
   suspend fun deleteShopItem(item:ShopListItem){
        repository.deleteItem(item)


    }
}