package com.example.myartspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val arte1 = R.drawable.mano
    val arte2 = R.drawable.renacimiento
    val arte3 = R.drawable.splash

    var numeroArte = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val siguiente: Button = findViewById(R.id.nextBtn)
        siguiente.setOnClickListener {
            nextArtwork()
        }

        val anterior: Button = findViewById(R.id.previousBtn)
        anterior.setOnClickListener {
            previousArtwork()
        }
    }

    fun changeArt(){
        val imageArt: ImageView = findViewById(R.id.artImage)
        val title: TextView = findViewById(R.id.titleText)
        val artist: TextView = findViewById(R.id.artistText)

        when (numeroArte) {
            0 -> {
                imageArt.setImageResource(arte1)
                title.text = "Mano"
                artist.text = "Manuel Lopez (2009)"
            }
            1 -> {
                imageArt.setImageResource(arte2)
                title.text = "Renacimiento"
                artist.text = "Jacobo García (2005)"
            }
            2 -> {
                imageArt.setImageResource(arte3)
                title.text = "Splash"
                artist.text = "Susana Sainz (2000)"
            }
        }
    }


    fun nextArtwork() {
        if (numeroArte == 2) {
            numeroArte = 0
        } else {
            numeroArte ++
        }

        changeArt()
    }

    fun previousArtwork() {

        if (numeroArte == 0) {
            numeroArte = 2
        } else {
            numeroArte --
        }

        changeArt()
    }
}