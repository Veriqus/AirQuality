package com.veriqus.airquality

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import com.veriqus.airquality.showQuality.AirActivity
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith



@RunWith(AndroidJUnit4::class)
@LargeTest
class TestAirActivity {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.veriqus.airquality", appContext.packageName)
    }

    @Rule
    @JvmField
    val rule  = ActivityTestRule<AirActivity>(AirActivity::class.java)

    @Before
    fun init() {
        rule.activity.fragmentManager.beginTransaction()
    }

    @Test
    fun dialog_appear(){
        Log.e("@Test","Performing dialog appear success test")
        onView(withText(R.string.notifications)).check(matches(isDisplayed()))
    }

    @Test
    fun performPositiveDialogClick(){
        onView(withId(android.R.id.button1)).perform(ViewActions.click())
    }

    @Test
    fun onViewLoadedShowAirQualityFragment() {
        // first it has to get rid of dialog
        onView(withId(android.R.id.button1)).perform(ViewActions.click())
        // looks for a view that has the id 'nearestFragmentView' and checks to see if it is displayed (shown)
        onView(withId(R.id.nearestFragmentView)).check(matches(isDisplayed()))
    }
}
