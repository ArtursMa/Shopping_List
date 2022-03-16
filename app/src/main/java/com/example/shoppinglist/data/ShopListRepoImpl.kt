package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopItemRepository
import com.example.shoppinglist.domain.ShopListItem
import kotlinx.coroutines.flow.Flow

class ShopListRepoImpl(val shopListDAO:ShopListDAO):ShopItemRepository {
    override fun getListOfItems(): Flow<List<ShopListItem>> {

        return shopListDAO.getAllShopItems()
    }

    override suspend fun addItem(item: ShopListItem) {
        shopListDAO.addItem(item)
    }

    override fun getItemById(id: Int): Flow<List<ShopListItem>> {
       return shopListDAO.getItemsById(id)
    }

    override suspend fun deleteItem(item: ShopListItem) {
        shopListDAO.deleteItem(item)
    }

    override suspend fun editItem(item: ShopListItem) {
       shopListDAO.editItem(item)
    }
}