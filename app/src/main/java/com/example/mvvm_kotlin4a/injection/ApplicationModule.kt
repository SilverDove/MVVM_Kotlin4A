package com.example.mvvm_kotlin4a.injection

import com.example.mvvm_kotlin4a.MainViewModel
import org.koin.dsl.module

val presentationModule = module{
    //On choisit le type (single, factory etc...)
    //single : singleton i.e. garde en mémoire l'état
    factory{ MainViewModel()} //factory: à chaque fois que vous en demandé un, vous en crée un nouveau (create a new instance)

}