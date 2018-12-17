package me.aluceps.practicerecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.ViewHolder
import me.aluceps.practicerecyclerview.databinding.ActivityMainBinding
import me.aluceps.practicerecyclerview.item.ItemHeaderViewHolder
import me.aluceps.practicerecyclerview.item.ItemNormalViewHolder

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    private var groupAdapter: GroupAdapter<ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        groupAdapter = GroupAdapter()
        initializeRecyclerView()
        for (i in 1..5) addItems(i)
    }

    private fun initializeRecyclerView() {
        binding.recyclerView.run {
            adapter = groupAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        }
    }

    private fun addItems(index: Int) {
        val section = Section()
        section.setHeader(ItemHeaderViewHolder(index.toLong()).apply { setText("Section No.$index") })
        for (i in 1..20) section.add(ItemNormalViewHolder(i.toLong()).apply { setText("Section No:$index Row:$i") })
        groupAdapter?.add(section)
    }
}
