package dev.khalil.freightpad.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import dev.khalil.freightpad.R
import dev.khalil.freightpad.databinding.FragmentRouteBinding

class RouteFragment : Fragment() {

  private lateinit var binding: FragmentRouteBinding

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = DataBindingUtil.inflate(inflater, R.layout.fragment_route, container, false)
    return binding.root
  }

}