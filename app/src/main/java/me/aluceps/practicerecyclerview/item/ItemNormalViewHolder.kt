package me.aluceps.practicerecyclerview.item

import com.xwray.groupie.databinding.BindableItem
import me.aluceps.practicerecyclerview.ItemViewModel
import me.aluceps.practicerecyclerview.R
import me.aluceps.practicerecyclerview.databinding.ItemNormalBinding

class ItemNormalViewHolder(id: Long) : BindableItem<ItemNormalBinding>(id) {

    private val viewModel = ItemViewModel()

    override fun getLayout(): Int = R.layout.item_normal

    override fun bind(viewBinding: ItemNormalBinding, position: Int) {
        viewBinding.viewModel = viewModel
        viewBinding.executePendingBindings()
    }

    fun setText(value: String) {
        viewModel.text.set(value)
        viewModel.notifyChange()
    }

    fun getText() = viewModel.text.get()
}