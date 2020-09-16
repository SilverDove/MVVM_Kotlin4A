package com.example.mvvm_kotlin4a

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//View model ne connait pas la view. Il update seulement les variables
class MainViewModel : ViewModel(){

    val counter: MutableLiveData<Int> = MutableLiveData()//Cycle de vie similaire à Observer en Java

    init{
        counter.value = 0 //Changer le texte grâce au setter de text
    }

    fun onClickIncrement(){
        counter.value = (counter.value ?: 0) + 1
    }
}