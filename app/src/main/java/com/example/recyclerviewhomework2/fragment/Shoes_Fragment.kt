package com.example.recyclerviewhomework2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.example.recyclerviewhomework2.R
import com.example.recyclerviewhomework2.adapter.ShoesAdapter
import com.example.recyclerviewhomework2.model.Shoes
import kotlinx.android.synthetic.main.fragment_shoes_.view.*

/**
 * A simple [Fragment] subclass.
 */
class Shoes_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_shoes_, container, false)
        var shoesArray = ArrayList<Shoes>()
        shoesArray.add(Shoes("001",R.drawable.one,"Nike Superlity"
            ,"Ellite FG","799"))
        shoesArray.add(Shoes("002",R.drawable.one,"Nike Superlity"
            ,"Ellite FG","200"))
        shoesArray.add(Shoes("003",R.drawable.one,"Nike Superlity"
            ,"Ellite FG","190"))
        shoesArray.add(Shoes("004",R.drawable.one,"Nike Superlity"
            ,"Ellite FG","899"))
        shoesArray.add(Shoes("005",R.drawable.one,"Nike Superlity"
            ,"Ellite FG","240"))
        shoesArray.add(Shoes("006",R.drawable.one,"Nike Superlity"
            ,"Ellite FG","111"))

        var shoesAdapter = ShoesAdapter(shoesArray)

        root.recyclerView.layoutManager = GridLayoutManager(context,2)
        root.recyclerView.adapter = shoesAdapter
        return root
    }

}
