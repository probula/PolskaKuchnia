package com.example.polskakuchniatradycyjna.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.polskakuchniatradycyjna.R
import com.example.polskakuchniatradycyjna.databinding.FragmentReadyMealBinding
import com.example.polskakuchniatradycyjna.viewmodel.OrderViewModel



class ReadyMealFragment : Fragment() {

    private var _binding: FragmentReadyMealBinding? = null
    private val binding get() = _binding!!

    private val viewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReadyMealBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.confirmButton.setOnClickListener {
            when (binding.mainDishGroup.checkedRadioButtonId) {
                R.id.mainDishSchabowy -> viewModel.setMainDish("Schabowy", 25.0)
                R.id.mainDishPierogi -> viewModel.setMainDish("Pierogi", 30.0)
            }

            viewModel.confirmPersonOrder()

            findNavController().navigate(R.id.summaryFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
