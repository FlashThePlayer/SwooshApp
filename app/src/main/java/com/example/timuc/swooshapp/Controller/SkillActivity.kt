package com.example.timuc.swooshapp.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.timuc.swooshapp.Model.Player
import com.example.timuc.swooshapp.R
import com.example.timuc.swooshapp.Utilities.EXTRA_PLAYER
import com.example.timuc.swooshapp.Utilities.TOGGLE_WARNING
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
    }

    fun onClickBeginnerBtn(view: View){
        skillExpertBtn.isChecked = false
        player.skill = "beginners"
    }

    fun onClickExpertBtn(view: View){
        skillBeginnerBtn.isChecked = false
        player.skill = "experts"
    }

    fun onClickFinishBtn(view: View) {
        if(player.skill.isEmpty()) {
            Toast.makeText(this, TOGGLE_WARNING, Toast.LENGTH_SHORT).show()
        }
        else{
            val FinishActivity = Intent(this, FinishActivity::class.java)
            FinishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(FinishActivity)
        }
    }

    override fun onResume() {
        super.onResume()
 //       Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }
}
