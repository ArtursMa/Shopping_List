package com.example.shoppinglist.presentation

import androidx.lifecycle.*
import com.example.shoppinglist.domain.*
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class MainScreenViewModel(val repository: ShopItemRepository):ViewModel() {
    val allShopListItems:LiveData<List<ShopListItem>> = (GetShopItemList(repository)
        .getShopItemList()).asLiveData()

    fun deleteSHopLIstItem(item:ShopListItem) = viewModelScope.launch {
        DeleteShopItem(repository).deleteShopItem(item)
    }

    fun editShopListItem(item:ShopListItem) = viewModelScope.launch {
       EditShopListItem(repository).editShopListItem(item)
    }
class MainScreenProviderFactory(private val repository: ShopItemRepository):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainScreenViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return MainScreenViewModel(repository) as T

        }
        throw IllegalArgumentException("Unknown class view model")
    }

}


}