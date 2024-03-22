package org.savyour;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTest {

    static AppiumDriver driver;

    @BeforeTest
    public void setup(){

        try {
            System.out.println("In Before Test..");
            DesiredCapabilities cap = new DesiredCapabilities();

            //this will work with if you create interface of mobilecapabilitytype because AppPackage and Activity does not exists in this interface

            cap.setCapability(MobileCapabilityTypeEx.DEVICE_NAME, "HUAWEI Y9 Prime 2019");
            cap.setCapability(MobileCapabilityTypeEx.UDID, "TMFNW19C11000039");
            cap.setCapability(MobileCapabilityTypeEx.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityTypeEx.PLATFORM_VERSION, "10");
            cap.setCapability(MobileCapabilityTypeEx.NEW_COMMAND_TIMEOUT, "60");
            //cap.setCapability(MobileCapabilityTypeEx.APP_PACKAGE, "com.disrupt.savyour.stage");
            //cap.setCapability(MobileCapabilityTypeEx.APP_ACTIVITY, "com.savyour.ui.feature.splash.SplashActivity");
            cap.setCapability(MobileCapabilityTypeEx.APP_PACKAGE, "com.disrupt.savyour");
            cap.setCapability(MobileCapabilityTypeEx.APP_ACTIVITY, "com.savyour.ui.feature.splash.SplashActivity");
            cap.setCapability(MobileCapabilityTypeEx.NO_RESET, true);
            //cap.setCapability(MobileCapabilityTypeEx.RESET_KEYBOARD, true);

            //Commented this because using the above method for capabilities
            /*cap.setCapability("deviceName", "HUAWEI Y9 Prime 2019");
            cap.setCapability("udid", "TMFNW19C11000039");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "10");
            cap.setCapability("appPackage", "com.disrupt.savyour.stage");
            cap.setCapability("appActivity", "com.savyour.ui.feature.splash.SplashActivity");*/


            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver(url, cap);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //driver = new AndroidDriver(url, cap);
            //driver  = new IOSDriver(url, cap);

        }

        catch (Exception exp) {
            System.out.println("Cause is "+ exp.getCause());
            System.out.println("Message is "+ exp.getMessage());
            exp.printStackTrace();
        }


    }

    @Test
    public void TestOne() throws InterruptedException {

        System.out.println("I am in test..");
        //Thread.sleep(15000);

    }

    @AfterTest
    public void teardown(){
        //driver.quit();
        //driver.close();
        System.out.println("In After Close..");

    }

}
