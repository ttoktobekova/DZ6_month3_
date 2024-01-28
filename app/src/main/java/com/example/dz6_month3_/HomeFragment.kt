package com.example.dz6_month3_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {
    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var newsArrayList: ArrayList<News>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var news: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(newsArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        newsArrayList = arrayListOf<News>()
        imageId = arrayOf(
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img,
            R.drawable.img

        )
        heading = arrayOf(


            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
            getString(R.string.list),
        )
        news = arrayOf(


            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
            getString(R.string.Hello),
        )

        for (i in imageId.indices) {
            val news = News(imageId[i], heading[i])
            newsArrayList.add(news)
        }

    }


}