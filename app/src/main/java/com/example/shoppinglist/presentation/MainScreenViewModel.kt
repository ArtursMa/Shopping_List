package com.example.shoppinglist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoppinglist.domain.ShopItemRepository
import com.example.shoppinglist.domain.ShopListItem
import kotlinx.coroutines.launch

class MainScreenViewModel(val repository: ShopItemRepository):ViewModel() {
    val allShopListItems:LiveData<List<ShopListItem>> = repository.getListOfItems() as LiveData<List<ShopListItem>>

    fun deleteSHopLIstItem(item:ShopListItem) = viewModelScope.launch {
        repository.deleteItem(item)
    }

    fun editShopListItem(item:ShopListItem) = viewModelScope.launch {
        repository.editItem(item)
    }


}