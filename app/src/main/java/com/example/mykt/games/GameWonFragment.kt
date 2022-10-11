package com.example.mykt.games

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.mykt.R
import com.example.mykt.databinding.FragmentGameOverBinding
import com.example.mykt.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate<FragmentGameWonBinding>(
            inflater,
            R.layout.fragment_game_won,
            container,
            false
        )
        // Inflate the layout for this fragment
        binding.nextMatchButton.setOnClickListener{view: View->
            view.findNavController()
                .navigate(R.id.action_gameWonFragment_to_gameFragment)}
        return binding.root
    }


}