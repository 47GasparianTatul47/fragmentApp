package com.example.fragmentapp

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    var nameStudent = MutableLiveData("")

    fun setEditText(newStudentsName: String) {
        nameStudent.value = newStudentsName

    }
}