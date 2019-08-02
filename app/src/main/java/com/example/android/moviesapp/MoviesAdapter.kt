package com.example.android.moviesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.movie_item.view.*

class MoviesAdapter (val list : ArrayList<Movie>) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesAdapter.MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_item, parent, false)

        return MovieViewHolder(view)
    }

    override fun getItemCount()=list.size

    override fun onBindViewHolder(holder: MoviesAdapter.MovieViewHolder, position: Int) {

        holder.itemView.tv_movie_title.text = list[position].name
        holder.itemView.tv_movie_description.text = list[position].describtion
        holder.itemView.movie_image.setImageResource(list[position].img)
    }

    class MovieViewHolder(view : View) : RecyclerView.ViewHolder(view)
}