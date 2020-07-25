package com.example.viewmodeldemo1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ChallengeExerciseViewModelFactory(private  val  startingTotal:Int ): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

       if(modelClass.isAssignableFrom(ChallengeExeciseViewModel::class.java))
       {
           return  ChallengeExeciseViewModel(startingTotal)as T
       }
        else
           throw IllegalArgumentException("Unknown Viewmodal Class")
    }
}