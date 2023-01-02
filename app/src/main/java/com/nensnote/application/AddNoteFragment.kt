package com.nensnote.application

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class AddNoteFragment: DialogFragment() {

    private lateinit var edtTitle: EditText
    private lateinit var edtContent: EditText
    private lateinit var btnAdd: Button

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.addnote_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //set up the addnote dialog
        edtTitle = view.findViewById(R.id.edtTitle)
        edtContent = view.findViewById(R.id.edtContent)
        btnAdd = view.findViewById(R.id.btnAdd)
    }
}
