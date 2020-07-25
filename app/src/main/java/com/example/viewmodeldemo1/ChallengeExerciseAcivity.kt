package com.example.viewmodeldemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo1.databinding.ActivityChallengeExerciseAcivityBinding

class ChallengeExerciseAcivity : AppCompatActivity() {

    private lateinit var binding: ActivityChallengeExerciseAcivityBinding
    private  lateinit var  viewModel: ChallengeExeciseViewModel
    private  lateinit var  viewModelFactory: ChallengeExerciseViewModelFactory
    private var count =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= DataBindingUtil.setContentView(this,R.layout.activity_challenge_exercise_acivity)

        viewModelFactory =ChallengeExerciseViewModelFactory(125)
        viewModel =ViewModelProvider(this,viewModelFactory).get(ChallengeExeciseViewModel::class.java)

         binding.viewModelChallenge=viewModel
         binding.lifecycleOwner =this

       // binding.textViewTotal.text = viewModel.getTotal().toString()
//         viewModel.totalData.observe(this, Observer {
//            binding.textViewTotal.text = it.toString()
//         })
//
//        binding.buttonAdd.setOnClickListener {
//
//            viewModel.setTotal(binding.editTextNumber.text.toString().toInt())
//        }


    }
}