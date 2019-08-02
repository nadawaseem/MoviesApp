package com.example.android.moviesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val movies = arrayListOf<Movie>(
    Movie("HarryPotter","Fictional Science",R.drawable.harrypotter),
    Movie("HomeAlone","Sarcastic",R.drawable.homealone),
    Movie("The Lion King","cartoon",R.drawable.the_lion_king_2018_poster)

)

        recycler_movies.adapter = MoviesAdapter(movies)
        recycler_movies.layoutManager = LinearLayoutManager(this)
    }
}
