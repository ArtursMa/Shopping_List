package com.example.shoppinglist.domain

import kotlinx.coroutines.flow.Flow

class GetShopItemList(private val repository: ShopItemRepository) {
    fun getShopItemList(): Flow<List<ShopListItem>> {
        return repository.getListOfItems()

    }
}