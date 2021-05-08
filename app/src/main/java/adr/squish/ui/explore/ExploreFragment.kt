package adr.squish.ui.explore

import adr.squish.DatabaseAccess
import adr.squish.R
import adr.squish.Squishmallow
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ExploreFragment : Fragment() {
    private lateinit var exploreViewModel: ExploreViewModel
    private lateinit var adapter: RecyclerAdapter
    private lateinit var layoutM: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        exploreViewModel =
            ViewModelProvider(this).get(ExploreViewModel::class.java)
        val root = inflater.inflate(R.layout.explore_fragment, container, false)

        val recycler : RecyclerView = root.findViewById(R.id.test_category)
        val databaseAccess : DatabaseAccess = DatabaseAccess.getInstance(context)
        databaseAccess.open()

        val sq : List<Squishmallow> = databaseAccess.squish
        databaseAccess.close()

        adapter = RecyclerAdapter(sq)
        layoutM = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        recycler.layoutManager = layoutM
        recycler.adapter = adapter

        return root
    }
}