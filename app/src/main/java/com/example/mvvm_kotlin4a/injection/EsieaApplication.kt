package com.example.mvvm_kotlin4a.injection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/*Koin permet de faire de l'injection de dépendance
Il n'y a pas d'obligation à l'utiliser pour tous les projets, ou pour un type d'architecture (MMVM)
L'un des avantages c'est que ça va permettre de faciliter les tests unitaires
 */
class EsieaApplication : Application(){
    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // Android context
            androidContext(this@EsieaApplication)
            // modules
            modules(presentationModule)
        }
    }
}