package adr.squish.ui.profile

import adr.squish.R
import adr.squish.ui.explore.ExploreViewModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class ProfileFragment : Fragment() {
    private lateinit var profileViewModel: ExploreViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileViewModel =
            ViewModelProvider(this).get(ExploreViewModel::class.java)
        val root = inflater.inflate(R.layout.profile_fragment, container, false)

        return root
    }
}