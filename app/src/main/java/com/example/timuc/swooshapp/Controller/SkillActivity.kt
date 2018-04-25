package com.example.timuc.swooshapp.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.timuc.swooshapp.Utilities.EXTRA_LEAGUE
import com.example.timuc.swooshapp.R
import com.example.timuc.swooshapp.Utilities.EXTRA_SKILL
import com.example.timuc.swooshapp.Utilities.TOGGLE_WARNING
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league =""
    var level =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onClickBeginnerBtn(view: View){
        skillExpertBtn.isChecked = false
        level = "beginners"
    }

    fun onClickExpertBtn(view: View){
        skillBeginnerBtn.isChecked = false
        level = "experts"
    }

    fun onClickFinishBtn(view: View) {
        if(league.isEmpty()) {
            Toast.makeText(this, TOGGLE_WARNING, Toast.LENGTH_SHORT).show()
        }
        else{
            val FinishActivity = Intent(this, FinishActivity::class.java)
            FinishActivity.putExtra(EXTRA_SKILL, level)
            FinishActivity.putExtra(EXTRA_LEAGUE, league)
            startActivity(FinishActivity)
        }
    }

    override fun onResume() {
        super.onResume()
 //       Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }
}
