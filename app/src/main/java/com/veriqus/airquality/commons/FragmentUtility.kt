package com.veriqus.airquality.commons

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

/**
 * Created by krzysztofmarczewski on 07.02.2018.
 */
object FragmentUtility {

    fun addIfNotExist(fm: FragmentManager, containerResource: Int, fragment: Fragment, tag: String) {
        val existingFragmentWithTag = fm.findFragmentByTag(tag)

        if(existingFragmentWithTag == null) {
            fm.beginTransaction().add(containerResource, fragment, tag).commit()
        }
    }

}