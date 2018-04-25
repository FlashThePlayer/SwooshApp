package com.example.timuc.swooshapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SkillActivity : BaseActivity() {

    var league =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }
}
