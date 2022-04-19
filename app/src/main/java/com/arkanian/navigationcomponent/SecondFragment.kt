package com.arkanian.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.arkanian.navigationcomponent.databinding.FragmentFirstBinding
import com.arkanian.navigationcomponent.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSecond.setOnClickListener {
            it.findNavController().navigate(R.id.thirdFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}