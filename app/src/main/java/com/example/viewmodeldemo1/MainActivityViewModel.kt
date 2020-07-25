package com.example.viewmodeldemo1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel() : ViewModel() {

  private  var count = MutableLiveData<Int>()

    val totalCount : LiveData<Int>
    get() =  count
    init {

        count.value = 0

    }



    fun updatedCount() {

        count.value = (count.value)?.plus(1)

    }

}