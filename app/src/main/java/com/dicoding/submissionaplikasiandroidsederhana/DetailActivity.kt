package com.dicoding.submissionaplikasiandroidsederhana

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_JUDUL = "extra_judul"
        const val EXTRA_COVER = "extra_cover"
        const val EXTRA_AUTHOR = "extra_author"
        const val EXTRA_YEAR = "extra_year"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_MORE_DETAIL = "extra_more_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvJudul: TextView = findViewById(R.id.judul)
        val tvAuthor: TextView = findViewById(R.id.author)
        val tvYear: TextView = findViewById(R.id.year)
        val imgCover: ImageView = findViewById(R.id.cover)
        val tvDescription: TextView = findViewById(R.id.description)
        val btnMoreDetail: Button = findViewById(R.id.btn_moredetail)

        val judul = intent.getStringExtra(EXTRA_JUDUL)
        val author = intent.getStringExtra(EXTRA_AUTHOR)
        val year = intent.getStringExtra(EXTRA_YEAR)
        val cover = intent.getIntExtra(EXTRA_COVER, 0)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)
        val linkDetail = intent.getStringExtra(EXTRA_MORE_DETAIL)

        tvJudul.text = judul
        tvAuthor.text = author
        tvYear.text = year
        tvDescription.text = description
        Glide.with(this)
            .load(cover)
            .into(imgCover)

        btnMoreDetail.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("$linkDetail"))
            startActivity(browserIntent)
        }

        val bar = supportActionBar
        bar!!.title = judul
        bar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}