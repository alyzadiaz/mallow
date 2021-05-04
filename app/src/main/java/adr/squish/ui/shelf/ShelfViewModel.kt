package adr.squish.ui.shelf

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShelfViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is the shelf fragment"
    }
}