package com.narutoshi.recyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.memo_list_card.view.*


class MemoListAdaptor(private val context: Context, private val items: ArrayList<MemoModel>) : RecyclerView.Adapter<MemoListAdaptor.ViewHolder>()  {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val memoItem: CardView = view.memoCard
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.memo_list_card, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val memoModel = items[position]
        holder.memoItem.txtViewTitle.text = memoModel.title
        holder.memoItem.txtViewContent.text = memoModel.content
    }
}