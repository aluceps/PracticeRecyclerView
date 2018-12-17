package me.aluceps.practicerecyclerview

import com.xwray.groupie.databinding.BindableItem
import me.aluceps.practicerecyclerview.databinding.ItemHeaderBinding

class ItemHeaderViewHolder(id: Long) : BindableItem<ItemHeaderBinding>(id) {

    private val viewModel = ItemViewModel()

    override fun getLayout(): Int = R.layout.item_header

    override fun bind(viewBinding: ItemHeaderBinding, position: Int) {
        viewBinding.viewModel = viewModel
        viewBinding.executePendingBindings()
    }

    fun setText(value: String) {
        viewModel.text.set(value)
        viewModel.notifyChange()
    }
}