package dev.nancy.replicatetwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class TweetrvAdapter(var twitterList: List<Twitter>) :RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent:ViewGroup, viewType: Int): TwitterViewHolder{
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
        return TwitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter =twitterList.get(position)
        holder.tvName.text = currentTwitter.name
        holder.tvhandle.text = currentTwitter.handle
        holder.tvMessage.text = currentTwitter.message
    }

    override fun getItemCount(): Int {
        return twitterList.size
    }
}


class TwitterViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvMessage = itemView.findViewById<TextView>(R.id.tvMessage)
    var tvhandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvreply= itemView.findViewById<ImageView>(R.id.tvreply)
    var tvretweet= itemView.findViewById<ImageView>(R.id.tvretweet)
    var tvlike= itemView.findViewById<ImageView>(R.id.tvlike)
    var tvshare= itemView.findViewById<ImageView>(R.id.tvShare)
    var ivPerson= itemView.findViewById<ImageView>(R.id.ivPerson)
}
