package com.example.polskakuchniatradycyjna.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.polskakuchniatradycyjna.R
import com.example.polskakuchniatradycyjna.databinding.FragmentSummaryBinding
import com.example.polskakuchniatradycyjna.viewmodel.OrderViewModel

class SummaryFragment : Fragment(R.layout.fragment_summary) {

    private var _binding: FragmentSummaryBinding? = null
    private val binding get() = _binding!!

    private val viewModel: OrderViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentSummaryBinding.bind(view)

        val sb = StringBuilder()
        viewModel.order.personOrders.forEachIndexed { index, person ->
            sb.append("Osoba ${index + 1}:\n")
            sb.append("Danie: ${person.mainDishName ?: "-"}\n")
            sb.append("Cena: ${person.mainDishPrice} zł\n\n")
        }

        binding.summaryText.text = sb.toString()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
