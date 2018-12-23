package me.aluceps.practicerecyclerview

import com.airbnb.epoxy.TypedEpoxyController

class SampleTypedEpoxyController : TypedEpoxyController<ItemData>() {

    override fun buildModels(data: ItemData?) {
        data?.let {
            itemHeader {
                id(it.header)
                name(it.header)
            }
            it.normal.forEachIndexed { i, s ->
                itemNormal {
                    id(i)
                    name(s)
                }
            }
        }
    }
}