package com.veriqus.airquality.showQuality

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.veriqus.airquality.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by krzysztofmarczewski on 08.02.2018.
 */


@RunWith(AndroidJUnit4::class)
@LargeTest
class NearestAirQualityFragmentTest {

    @Rule
    @JvmField
    val rule  = ActivityTestRule<AirActivity>(AirActivity::class.java)

    @Test
    fun clickStartIdentifyButtonOpensSongDetailPage() {
        onView(withId(android.R.id.button1)).perform(ViewActions.click())
        onView(withId(R.id.qualityDescription)).perform(click())
        onView(withId(R.id.locationChangeLayout)).check(matches(isDisplayed()))
    }
}