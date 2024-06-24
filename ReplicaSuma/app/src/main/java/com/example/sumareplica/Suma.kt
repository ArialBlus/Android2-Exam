package com.example.sumareplica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sumareplica.databinding.FragmentSumaBinding

class Suma : Fragment() {

    lateinit var binding: FragmentSumaBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding=FragmentSumaBinding.inflate(layoutInflater)
        suma()
        // Inflate the layout for this fragment
        return binding.root
    }

    public fun suma(){

        binding.btnSuma.setOnClickListener{
            val num1= binding.Num1.editText?.text.toString().toInt()
            val num2=binding.Num2.editText?.text.toString().toInt()

            val resultado= start(num1, num2)

            binding.resultado.hint=resultado.toString()


        }
    }

    public  fun  start(num1:Int, num2:Int):Int {
        return num1 + num2
    }



}