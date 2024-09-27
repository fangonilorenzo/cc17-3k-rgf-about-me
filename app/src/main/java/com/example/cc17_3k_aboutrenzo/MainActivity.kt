package com.example.cc17_3k_aboutrenzo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3k_aboutrenzo.adapter.AboutMeAdapter
import com.example.cc17_3k_aboutrenzo.model.AboutMe

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvAboutMe: RecyclerView = findViewById(R.id.rvAboutMe)
        rvAboutMe.layoutManager = LinearLayoutManager(this)

        val aboutMe1 = AboutMe(R.mipmap.ic_launcher, "Renzo Fangonilo",
            "Short Desc",
            { view ->
                val intent = Intent(this, AboutRenzoActivity::class.java)
                startActivity(intent)
            })

        val aboutMe2 = AboutMe(R.mipmap.ic_launcher, "Renzo Pogi Mo",
            "Taga Elyu",
            {/*TODO*/ })

        val arraylist = arrayListOf<AboutMe>(aboutMe1, aboutMe2)

                rvAboutMe.adapter = AboutMeAdapter(arraylist)
    }
}