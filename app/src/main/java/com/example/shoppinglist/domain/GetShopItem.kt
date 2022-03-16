package com.example.shoppinglist.domain

class GetShopItem(private val repository: ShopItemRepository) {
    fun getShopItem( id:Int):ShopListItem{
       return repository.getItemById(id)



    }
}