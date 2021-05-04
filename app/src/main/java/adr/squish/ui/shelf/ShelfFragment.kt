package adr.squish.ui.shelf

import adr.squish.R
import adr.squish.ui.explore.ExploreViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class ShelfFragment : Fragment() {
    private lateinit var shelfViewModel: ShelfViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        shelfViewModel =
            ViewModelProvider(this).get(ShelfViewModel::class.java)
        val root = inflater.inflate(R.layout.shelf_fragment, container, false)

        return root
    }
}