package com.veriqus.airquality.showQuality


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.veriqus.airquality.R
import com.veriqus.airquality.commons.inflate
import com.veriqus.airquality.locatonChange.LocationChangeActivity
import kotlinx.android.synthetic.main.fragment_nearest_air_quality.*




/**
 * A simple [Fragment] subclass.
 */
class NearestAirQualityFragment : Fragment() {



    companion object {

        fun newInstance(): NearestAirQualityFragment {
            return NearestAirQualityFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = container?.inflate(R.layout.fragment_nearest_air_quality)
        return view
    }

    private fun makeIntent() {
        val intent = Intent(activity, LocationChangeActivity::class.java)
        startActivity(intent)
    }


    override fun onResume() {
        super.onResume()
        qualityDescription?.setOnClickListener { makeIntent() }

    }

}// Required empty public constructor
