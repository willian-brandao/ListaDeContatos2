package com.will.ContactMe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //recycle view component
    private  val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updateList()
    }


    private fun bindViews(){
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }
    private fun updateList() {
        adapter.updateList(
            arrayListOf(
                Contact(
                    "Silvester Stallone",
                    "(00) 0000-0000",
                    "img.png"
                ),
                Contact(
                    "Arnold Schwarzenegger",
                    "(00) 0000-0000",
                    "img.png"
                ),
                Contact(
                    "Chuck Norris",
                    "(00) 0000-0000",
                    "img.png"
                )

            )
        )
    }
    private fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    //create menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.item_menu1 -> {
                showToast("Item 1")
                return true
            }
            R.id.item_menu2 -> {
                showToast("Item 2")
                return true
            }
            R.id.item_menu3 -> {
                showToast("Item 3")
                return true
            }
            R.id.item_menu4 -> {
                showToast("Item 4")
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}