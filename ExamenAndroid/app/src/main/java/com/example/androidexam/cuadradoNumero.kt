package com.example.androidexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidexam.databinding.FragmentCuadradoNumeroBinding


class cuadradoNumero : Fragment() {
    lateinit var binding: FragmentCuadradoNumeroBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentCuadradoNumeroBinding.inflate(layoutInflater)
        start()
        return binding.root
    }

    public fun start(){
        binding.btnCuadrado.setOnClickListener{
            val num1:Int=binding.Num1.editText?.text.toString().toInt()
            val resultado:Int= num1*num1
            binding.resultado.hint = resultado.toString()

        }

    }

}