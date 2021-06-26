package com.appium.support;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumConfig {
    private AndroidDriver driver;
    private String APP = "https://github.com/ju-padawan/apkTeste/releases/download/apkTeste/calculator-7-8-271241277.apk";

    public void start() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", APP);

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }
}
