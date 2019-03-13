package com.example.primalezioneconpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.* // Ho dovuto inserirla io a mano questa import

class MainActivity : AppCompatActivity() {  /*ereditarietà*/
   // classe per la main activity
    override fun onCreate(savedInstanceState: Bundle?) {
       val a=10;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val s= Nome.text
        button.set0nClickListener{textMessaggio.text="Ciao"+ s}
    }
}
//Kotlin ha gia dichiarati tutti gli oggetti che ho messo a video (con lo stesso ID che ho utilizzato
// si preferisce usare le costanti non le variabili, come nel caso di Saluto ( var= variabile , val = valore)
//  dichiarazione variabili var a: Int   ... costanti invece val b = 7     .. capisce da solo che costante è
// è valido scrivere var c= 'Pippo'  che la nomina stringa costante
// Non esiste lo switch ma esiste il when. Cosa particolare : tipi sono nullabili , ossia var d: Int?
// d può contenere sia un intero che NIENTE , ossia valore non assegnato. E' utile con gli oggetti grafici. Se l'utente riempie la form senza niente
// allora sarà utile.
// dichiarazione funzioni in kotlin :    private fun somma( a: Int, b: Int)-> Int{... return a}  prende due interi e restituisce un intero