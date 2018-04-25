package com.example.timuc.swooshapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*


class LeagueActivity : BaseActivity() {

    var selectedLeague =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if (selectedLeague.isEmpty()){
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        } else {
        val skillActivity = Intent(this, SkillActivity::class.java )
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
        startActivity(skillActivity)
        }
    }

    fun onMensClicked (view: View){
        leagueWomansBtn.isChecked = false
        leagueCoEdBtn.isChecked = false
        selectedLeague = "men"
    }

    fun onWomansClicked(view: View){
        leagueCoEdBtn.isChecked = false
        leagueMensBtn.isChecked = false
        selectedLeague = "woman"

    }

    fun onCoEdClicked(view: View){
        leagueWomansBtn.isChecked = false
        leagueMensBtn.isChecked = false
        selectedLeague = "Co-Ed"

    }
}
