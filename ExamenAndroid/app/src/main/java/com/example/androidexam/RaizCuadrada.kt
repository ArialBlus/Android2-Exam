package com.example.androidexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlin.math.sqrt
import com.example.androidexam.databinding.FragmentCuadradoNumeroBinding
import com.example.androidexam.databinding.FragmentRaizCuadradaBinding


class RaizCuadrada : Fragment() {
    lateinit var binding: FragmentRaizCuadradaBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentRaizCuadradaBinding.inflate(layoutInflater)
        start()
        return binding.root
    }

    public fun start(){
        binding.btnRaizCuadrada.setOnClickListener{
            val num1:Double=binding.Num1.editText?.text.toString().toDouble()
            val resultado: Double = sqrt(num1)
            binding.resultado.hint = resultado.toString()

        }

    }

}