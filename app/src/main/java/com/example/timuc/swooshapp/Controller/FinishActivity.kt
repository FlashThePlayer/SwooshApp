package com.example.timuc.swooshapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.timuc.swooshapp.R
import com.example.timuc.swooshapp.Utilities.EXTRA_LEAGUE
import com.example.timuc.swooshapp.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    var league =""
    var level =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        level = intent.getStringExtra(EXTRA_SKILL)


        searchViewTxt.text = "looking for $league $level near you..."
    }
}
