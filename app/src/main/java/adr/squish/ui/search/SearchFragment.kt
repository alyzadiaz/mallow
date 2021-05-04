package adr.squish.ui.search

import adr.squish.R
import adr.squish.ui.explore.ExploreViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class SearchFragment : Fragment() {
    private lateinit var searchViewModel: ExploreViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        searchViewModel =
            ViewModelProvider(this).get(ExploreViewModel::class.java)
        val root = inflater.inflate(R.layout.search_fragment, container, false)

        return root
    }
}