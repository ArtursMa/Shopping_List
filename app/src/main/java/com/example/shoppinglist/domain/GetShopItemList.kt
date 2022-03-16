package com.example.shoppinglist.domain

class GetShopItemList(private val repository: ShopItemRepository) {
    fun getShopItemList():List<ShopListItem>{
        return repository.getListOfItems()

    }
}