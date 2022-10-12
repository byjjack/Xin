package com.example.mykt.games

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.mykt.R
import com.example.mykt.databinding.FragmentGameOverBinding

// TODO: Rename parameter arguments, choose names that match

class GameOverFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val binding: FragmentGameOverBinding = DataBindingUtil.inflate<FragmentGameOverBinding>(
            inflater,
            R.layout.fragment_game_over,
            container,
            false
        )
//        binding.tryAgainButton.setOnClickListener{view: View->
//            view.findNavController()
//                .navigate(R.id.action_gameOverFragment_to_gameFragment)}
        binding.tryAgainButton.setOnClickListener{view: View->
            view.findNavController()
                .navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())}


        val args = GameOverFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(context, "NumCorrect: ${args.numT}, NumQuestions: ${args.numIndex}", Toast.LENGTH_LONG).show()
        return binding.root
    }

}