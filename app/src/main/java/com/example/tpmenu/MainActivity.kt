package com.example.tpmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
}


//partie graphique
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar,menu)
        val searchItem=menu?.findItem(R.id.action_bar)
        val searchView=searchItem?.actionView
        return true
    }
//partie Algorithmique
    //menu algo

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
            when (item.itemId)
            {
                R.id.Exit ->
                {
                    this@MainActivity.finish()
                    exitProcess(0)
                }
                R.id.menu_search  ->
                {
                    Toast.makeText(this,"le contenu a été recherchée",Toast.LENGTH_LONG).show()
                }
                else ->{ return super.onOptionsItemSelected(item)}
            }

            return true
        }
    }



