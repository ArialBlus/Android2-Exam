package com.example.androidexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlin.math.sqrt
import com.example.androidexam.databinding.FragmentCuadradoNumeroBinding
import com.example.androidexam.databinding.FragmentNextCuboBinding
import com.example.androidexam.databinding.FragmentRaizCuadradaBinding
import kotlin.math.pow


class nextCubo : Fragment() {
    lateinit var binding: FragmentNextCuboBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentNextCuboBinding.inflate(layoutInflater)
        start()
        return binding.root
    }

    public fun start(){
        binding.btnSucesor.setOnClickListener{
            val num1Str = binding.Num1.editText?.text.toString()
            val num1: Double = num1Str.toDouble()
            val resultado = (num1 + 1).pow(3)
            binding.resultado.hint = resultado.toString()

        }

    }

}