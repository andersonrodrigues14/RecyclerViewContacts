package com.devspace.recyclerview

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Create data class
        //Create list from data class type
        //Create Adapter
        //Set Adapter
        //Linear layout manager
        // Submeter a lista

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }

    }
}

val contacts = listOf(
    Contact(
        name = "Carla",
        phone = "(55) 11 112345678",
        icon = R.drawable.sample1
    ),
    Contact(
        name = "Jose",
        phone = "(55) 11 998745632",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Joana",
        phone = "(59) 11 996547811",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Carol",
        "(59) 11 236587421",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Andressa",
        "(59) 11 985632574",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Camila",
        phone = "(59) 11 985321457",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Kaka",
        phone = "(59) 11 965235784",
        icon = R.drawable.sample7
    ),
    Contact(
        name = "Frederico",
        phone = "(59) 11 326541879",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Juilson",
        phone = "(59) 11 023987453",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Vladimir",
        phone = "(59) 11 964447822",
        icon = R.drawable.sample10
    ),
    Contact(
        name = "Alana",
        phone = "(59) 11 896555478",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Carlinhos",
        phone = "(59) 11 966644778",
        icon = R.drawable.sample12
    ),
    Contact(
        name = "Julia",
        phone = "(59) 11 000322456",
        icon = R.drawable.sample13
    ),
    Contact(
        name = "Rodolfo",
        phone = "(59) 11 999666327",
        icon = R.drawable.sample14
    ),
    Contact(
        name = "Josiana",
        phone = "(59) 11 988877441",
        icon = R.drawable.sample15
    ),
    Contact(
        name = "Pitty",
        phone = "(59) 11 222333114",
        icon = R.drawable.sample16
    ),
)