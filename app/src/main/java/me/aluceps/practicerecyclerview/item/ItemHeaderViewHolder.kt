package me.aluceps.practicerecyclerview.item

import com.xwray.groupie.databinding.BindableItem
import me.aluceps.practicerecyclerview.ItemViewModel
import me.aluceps.practicerecyclerview.R
import me.aluceps.practicerecyclerview.databinding.ItemHeaderBinding

class ItemHeaderViewHolder(id: Long) : BindableItem<ItemHeaderBinding>(id) {

    private val viewModel = ItemViewModel()

    override fun getLayout(): Int = R.layout.item_header

    override fun bind(viewBinding: ItemHeaderBinding, position: Int) {
        viewBinding.viewModel = viewModel
    }

    fun setText(value: String) {
        viewModel.text.set(value)
        viewModel.notifyChange()
    }
}