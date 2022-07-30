package com.dicoding.submissionaplikasiandroidsederhana

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions

class ListNovelAdapter(private val listNovel: ArrayList<Novel>) : RecyclerView.Adapter<ListNovelAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvJudul: TextView = itemView.findViewById(R.id.tv_item_nama)
        var tvNegara: TextView = itemView.findViewById(R.id.tv_item_negara)
        var tvYear: TextView = itemView.findViewById(R.id.tv_item_year)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_item_genre)
        var imgPhoto: ImageView = itemView.findViewById(R.id.sampul)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val novel = listNovel[position]

        Glide.with(holder.itemView.context)
            .load(novel.photo)
//            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvJudul.text = novel.judul
        holder.tvNegara.text = novel.negara
        holder.tvYear.text = novel.year
        holder.tvGenre.text = novel.genre


        val context = holder.itemView.context
        holder.itemView.setOnClickListener {
            val detail = Intent(context, DetailActivity::class.java)
            detail.putExtra(DetailActivity.EXTRA_COVER, novel.photo)
            detail.putExtra(DetailActivity.EXTRA_JUDUL, novel.judul)
            detail.putExtra(DetailActivity.EXTRA_AUTHOR, novel.author)
            detail.putExtra(DetailActivity.EXTRA_YEAR, novel.year)
            detail.putExtra(DetailActivity.EXTRA_DESCRIPTION, novel.description)
            detail.putExtra(DetailActivity.EXTRA_MORE_DETAIL, novel.moreDetail)
            context.startActivity(detail)
        }

    }

    override fun getItemCount(): Int {
        return listNovel.size
    }

}