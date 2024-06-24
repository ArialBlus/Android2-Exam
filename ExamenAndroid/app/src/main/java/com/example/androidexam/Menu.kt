package com.example.androidexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidexam.databinding.FragmentMenuBinding


class Menu : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding: FragmentMenuBinding
        binding=FragmentMenuBinding.inflate(layoutInflater)
        binding.btnCuadrado.setOnClickListener{
            findNavController().navigate(R.id.go_cuadrado)

        }
        binding.btnRaiz.setOnClickListener{
            findNavController().navigate(R.id.go_raiz)

        }
        binding.btnAntecesor.setOnClickListener{
            findNavController().navigate(R.id.go_antecesor)

        }
        binding.btnCubo.setOnClickListener{
            findNavController().navigate(R.id.go_cubo)

        }


        return binding.root
    }

}