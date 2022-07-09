package dev.nancy.replicatetwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.nancy.replicatetwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTwitter()


    }

    fun displayTwitter() {
        var twitter = Twitter("Mitchell", "@mit", "I love coding","Any fool can write code that a computer can understand. Good programmers write code that humans can understand.")
        var twitter1 = Twitter("Gumato", "@gume_robba", "I love travelling","i joofg")
        var twitter2 = Twitter("Cheko Ala", "@cheko_sharon", "I love watching","Experience is the name everyone gives to their mistakes.")
        var twitter3 = Twitter("Dennis Muia", "@den_mato", "I love reading"," In order to be irreplaceable, one must always be differen")

            var twitterList= listOf(twitter, twitter2, twitter3
        )
        var twitterAdapter = TweetrvAdapter(twitterList )
        binding.rvtweet.layoutManager =LinearLayoutManager(this)
        binding.rvtweet.adapter = twitterAdapter
    }
}