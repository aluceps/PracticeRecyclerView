package me.aluceps.practicerecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import me.aluceps.practicerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    private val controller by lazy {
        SampleTypedEpoxyController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.recyclerView.run {
            adapter = controller.adapter
            layoutManager = LinearLayoutManager(context)
        }
        controller.setData(ItemData("header1", listOf(
                "item: 1",
                "item: 2",
                "item: 3",
                "item: 4",
                "item: 5",
                "item: 6",
                "item: 7",
                "item: 8",
                "item: 9",
                "item: 10",
                "item: 11",
                "item: 12",
                "item: 13",
                "item: 14",
                "item: 15",
                "item: 16",
                "item: 17",
                "item: 18",
                "item: 19",
                "item: 20"
        )))
    }
}
