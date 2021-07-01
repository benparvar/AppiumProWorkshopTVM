package com.appium.test;

import com.appium.support.AppiumConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class AppiumHelloWorld extends AppiumConfig {

    private AppiumConfig appiumConfig;

    @Before
    public void setUp() throws MalformedURLException {
        appiumConfig = new AppiumConfig();
        appiumConfig.start();
    }

    @After
    public void tearDown() {
        appiumConfig = new AppiumConfig();
        appiumConfig.stop();
    }

    @Test
    public void appiumHelloWorld() throws InterruptedException {
        Thread.sleep(1000);

        driver.findElementById("com.google.android.calculator:id/digit_9").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("com.google.android.calculator:id/digit_2").click();
        driver.findElementByAccessibilityId("equals").click();
        Thread.sleep(1000);

    }
}