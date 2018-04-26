package com.example.timuc.swooshapp.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.timuc.swooshapp.Model.Player
import com.example.timuc.swooshapp.R
import com.example.timuc.swooshapp.Utilities.EXTRA_PLAYER
import com.example.timuc.swooshapp.Utilities.TOGGLE_WARNING
import kotlinx.android.synthetic.main.activity_league.*


class LeagueActivity : BaseActivity() {

    var player = Player ("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if (player.league.isEmpty()){
            Toast.makeText(this, TOGGLE_WARNING, Toast.LENGTH_SHORT).show()
        } else {
        val skillActivity = Intent(this, SkillActivity::class.java )
            skillActivity.putExtra(EXTRA_PLAYER, player)
        startActivity(skillActivity)
        }
    }

    fun onMensClicked (view: View){
        leagueWomansBtn.isChecked = false
        leagueCoEdBtn.isChecked = false
        player.league = "men"
    }

    fun onWomansClicked(view: View){
        leagueCoEdBtn.isChecked = false
        leagueMensBtn.isChecked = false
        player.league = "woman"

    }

    fun onCoEdClicked(view: View){
        leagueWomansBtn.isChecked = false
        leagueMensBtn.isChecked = false
        player.league = "Co-Ed"

    }
}
