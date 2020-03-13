package com.daffzzaqihaq.sub1kade.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.daffzzaqihaq.sub1kade.model.LeaguesItem
import com.squareup.picasso.Picasso
import org.jetbrains.anko.*

class MainAdapter(val items: List<LeaguesItem>) : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    companion object{
        const val ID_ITEM_IMG = 1
        const val ID_TV_ITEM = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=
        MyViewHolder(
            itemListUI()
                .createView(AnkoContext.create(parent.context, parent))
        )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class MyViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val imgBadge = view.findViewById<ImageView>(ID_ITEM_IMG)
        val tvLeague = view.findViewById<TextView>(ID_TV_ITEM)

        fun bind(items: com.daffzzaqihaq.sub1kade.model.LeaguesItem){
            tvLeague.text = items.strLeague
            Picasso.get().load(items.strBadge).fit().into(imgBadge)
        }
    }

    class itemListUI(): AnkoComponent<View>{
        override fun createView(ui: AnkoContext<View>): View {
            return with (ui){
                relativeLayout {
                    RelativeLayout.CENTER_IN_PARENT
                    width.div(wrapContent)
                    height.div(wrapContent)

                    imageView {
                        id =
                            ID_ITEM_IMG
                    }.lparams(dip(150), dip(150))

                    textView {
                        id =
                            ID_TV_ITEM
                    }.lparams(dip(150), dip(wrapContent))
                }
            }
        }

    }

}