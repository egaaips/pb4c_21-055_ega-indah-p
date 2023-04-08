package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageAdapter()
//        mainAdapter()

    }
    private fun imageAdapter(){
        val images = listOf<Int>(
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
        )

        val imageAdapter = ImageAdapter( images )
        findViewById<RecyclerView>(R.id.recyclerView).adapter = imageAdapter
    }

    private fun mainAdapter(){
        val names = listOf<String>(
            "Azam",
            "Raihan",
            "Azam",
            "Raihan",
            "Azam",
            "Raihan",
            "Azam",
            "Raihan",
        )
        val mainAdapter = MainAdapter(names)
        findViewById<RecyclerView>(R.id.recyclerView).adapter = mainAdapter

        }
    }


//        Log.e("MainActivity","size ${names.size}")
//        Log.e("MainActivity", names[1])

//        names.forEach{ name ->
//            Log.e("MainActivity", name )
//        }
