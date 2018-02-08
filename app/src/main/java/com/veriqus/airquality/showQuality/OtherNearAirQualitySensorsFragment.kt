package com.veriqus.airquality.showQuality


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.veriqus.airquality.R


/**
 * A simple [Fragment] subclass.
 */
class OtherNearAirQualitySensorsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_other_near_air_quality_sensors, container, false)
    }

}// Required empty public constructor
