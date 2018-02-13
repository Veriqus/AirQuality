package com.veriqus.airquality.showQuality

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import com.veriqus.airquality.R
import com.veriqus.airquality.commons.FragmentUtility

class AirActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_air)

        FragmentUtility.addIfNotExist(supportFragmentManager, R.id.airActivityContainer,
                NearestAirQualityFragment.newInstance(), "NearestAirQualityFragment")

        buildAlert()

    }

    private fun buildAlert() {
        AlertDialog.Builder(this)
                .setTitle(getString(R.string.notifications))
                .setMessage(getString(R.string.notification_question))
                .setNegativeButton(getString(R.string.no), { _, _ ->
                    // "No thanks" button was clicked
                    // Do nothing
                })
                .setPositiveButton(getString(R.string.ok), { _, _ ->
                    // "OK" button was clicked
                    // Go to settings for getting city name of user
                })
                .show()
    }


}
