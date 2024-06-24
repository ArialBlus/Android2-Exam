package com.example.androidexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidexam.databinding.FragmentAntecesorBinding
import kotlin.math.sqrt
import com.example.androidexam.databinding.FragmentCuadradoNumeroBinding
import com.example.androidexam.databinding.FragmentRaizCuadradaBinding


class Antecesor : Fragment() {
    lateinit var binding: FragmentAntecesorBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentAntecesorBinding.inflate(layoutInflater)
        start()
        return binding.root
    }

    public fun start(){
        binding.btnAncestro.setOnClickListener{
            val num1Str = binding.Num1.editText?.text.toString()
            val num1: Int = num1Str.toInt()
            val resultado = num1 - 1
            binding.resultado.hint = resultado.toString()

        }

    }

}