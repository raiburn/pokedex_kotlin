package com.raiburn.pokedex

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_resource, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {

            R.id.action_new -> {
                Toast.makeText(this, "Add New", Toast.LENGTH_SHORT)
                true
            }
            R.id.action_search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT)
                true
            }
            R.id.action_recharge -> {
                Toast.makeText(this, "Recharge", Toast.LENGTH_SHORT)
                true
            }
            R.id.action_delete -> {
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
