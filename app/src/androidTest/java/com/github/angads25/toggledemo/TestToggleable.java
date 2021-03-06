package com.github.angads25.toggledemo;

import junit.framework.Assert;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import com.github.angads25.toggle.widget.LabeledSwitch;

@RunWith(AndroidJUnit4.class)
public class TestToggleable {

    @Rule public ActivityTestRule<TestActivity> mActivityRule = new ActivityTestRule<>(TestActivity.class);

    @Test public void labelledSwitchClick() {
        LabeledSwitch labeledSwitch = mActivityRule.getActivity().findViewById(R.id.switch1);
        onView(withId(R.id.switch1)).perform(click());
        Assert.assertTrue("The switch wasn't turned on", labeledSwitch.isOn());
    }

    @Test public void labelledSwitchDialog() {

    }
}
