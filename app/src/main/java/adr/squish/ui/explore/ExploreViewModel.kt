package adr.squish.ui.explore

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExploreViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is the explore fragment"
    }
}