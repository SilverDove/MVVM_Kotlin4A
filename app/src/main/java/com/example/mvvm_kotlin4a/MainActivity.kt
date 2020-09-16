package com.example.mvvm_kotlin4a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    val mainViewModel: MainViewModel by inject() //Activer Koin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Après avoir cliqué sur le boutton
        main_button.setOnClickListener{
            mainViewModel.onClickIncrement()
        }

        //Koin crée la classe seulement ici
        //Observe si le text a été modifié
        mainViewModel.counter.observe(this, Observer{value -> //Change le nom de la variable que la lambda donne
            //Quand le text a été modifié, on met à jour l'affichage
            main_text.text = value.toString()
        })
    }
}