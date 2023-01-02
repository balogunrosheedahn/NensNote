package com.nensnote.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var recyclerNotes: RecyclerView
    private lateinit var viewPager2: ViewPager2
    private lateinit var fabAddBtn: FloatingActionButton
    private lateinit var addNotesBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initVar()
        fabAddBtn.setOnClickListener{
            showAddnoteDialog()

        }
        addNotesBtn.setOnClickListener{
            fabAddBtn.performClick()

        }
    }

    private fun initVar(){
        addNotesBtn = findViewById(R.id.addNotesBtn)
        fabAddBtn = findViewById(R.id.fabAddBtn)
        recyclerNotes =findViewById(R.id.recyclerNotes)


        recyclerNotes.setLayoutManager( GridLayoutManager(this, 2))

    }

    private fun showAddnoteDialog(){
        var fragmentManager = supportFragmentManager
        var addNoteFragment = AddNoteFragment()
        addNoteFragment.show(fragmentManager, "add_notes")
    }
}





