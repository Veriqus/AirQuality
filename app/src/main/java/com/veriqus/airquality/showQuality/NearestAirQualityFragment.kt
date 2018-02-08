package com.veriqus.airquality.showQuality


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.veriqus.airquality.R
import com.veriqus.airquality.commons.inflate


/**
 * A simple [Fragment] subclass.
 */
class NearestAirQualityFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_nearest_air_quality)
    }

}// Required empty public constructor
