package com.example.shoppinglist.domain

class EditShopListItem (private val repository: ShopItemRepository){
    fun editShopListItem(item:ShopListItem){
        repository.editItem(item)


    }
}