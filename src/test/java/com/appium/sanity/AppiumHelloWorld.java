package com.appium.sanity;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumHelloWorld {

    private AndroidDriver driver;
    private String APP = "https://github.com/ju-padawan/apkTeste/releases/download/apkTeste/calculator-7-8-271241277.apk";

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", APP);

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void appiumHelloWorld() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElementById("com.google.android.calculator:id/digit_9").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("com.google.android.calculator:id/digit_2").click();
        driver.findElementByAccessibilityId("equals").click();
        Thread.sleep(10000);
    }
}