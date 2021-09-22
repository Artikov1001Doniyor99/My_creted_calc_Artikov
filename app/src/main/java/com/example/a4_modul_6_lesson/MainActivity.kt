package com.example.a4_modul_6_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(tv)

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = MenuInflater(this)
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var id = item.itemId
        when(id){
            R.id.save -> {
                Toast.makeText(this, "Save item click", Toast.LENGTH_SHORT).show()
            }
            R.id.delete -> {
                Toast.makeText(this, "Delete item click", Toast.LENGTH_SHORT).show()
            }
            R.id.edit -> {
                Toast.makeText(this, "Edit item click", Toast.LENGTH_SHORT).show()
            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {

        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.contect_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val itemId = item.itemId
        when(itemId){
            R.id.add -> {
                Toast.makeText(this, "Add item click", Toast.LENGTH_SHORT).show()
            }
            R.id.remove -> {
                Toast.makeText(this, "Remove item click", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onContextItemSelected(item)
    }
}