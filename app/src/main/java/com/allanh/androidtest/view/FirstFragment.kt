package com.allanh.androidtest.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.allanh.androidtest.R
import com.allanh.androidtest.adapters.LaunchAdapter
import com.allanh.androidtest.databinding.FragmentFirstBinding
import org.koin.androidx.viewmodel.ext.android.stateViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private val viewModel by stateViewModel<LaunchViewModel>()
    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        _binding?.lifecycleOwner = viewLifecycleOwner
        val adapter = LaunchAdapter()
//        binding.launch_list.adapter = adapter
//        subscribeUi(adapter)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onResume() {
        super.onResume()
        initData()
    }

    private fun initData() {
        viewModel.fetchLaunchData().observe(viewLifecycleOwner) { response ->
            if (response.isSuccessful) {
                // TODO: update layout
            }
        }
    }
}