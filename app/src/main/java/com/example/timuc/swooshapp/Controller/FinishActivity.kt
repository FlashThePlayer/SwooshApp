package com.example.timuc.swooshapp.Controller

import android.os.Bundle
import com.example.timuc.swooshapp.Model.Player
import com.example.timuc.swooshapp.R
import com.example.timuc.swooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        searchViewTxt.text = "looking for ${player.league} ${player.skill} players near you..."
    }
}
