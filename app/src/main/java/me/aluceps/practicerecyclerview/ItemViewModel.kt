package me.aluceps.practicerecyclerview

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField

class ItemViewModel : BaseObservable() {

    val text: ObservableField<String> = ObservableField()
}