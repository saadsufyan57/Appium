package org.savyour;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v117.input.model.TouchPoint;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.security.Key;
import java.time.Duration;

public class testsOne extends AppTest{

    @Test
    public void testCases() throws InterruptedException {
        System.out.println("Application Started..");

        // Specify the locator of the element you are waiting for

        //By elementLocator = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[2]");

        /*boolean checker = driver.findElement(By.xpath("//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[1]")).getAttribute("clickable").equals("true");
        if(checker){
            System.out.println("Screen exists..");
        }*/

        try{
            Boolean OnboardingScreen = driver.findElement(By.xpath("//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[2]")).isDisplayed();
            if (OnboardingScreen){
                WebElement skipOne = driver.findElement(By.xpath("//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[2]"));
                skipOne.click();
                System.out.println("Skip One");

                //WebElement skipTwo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[2]"));
                skipOne.click();

                System.out.println("Skip Two");

                //WebElement skipThree = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[2]"));
                skipOne.click();

                System.out.println("Skip Three");

                WebElement phoneNumber = driver.findElement(By.id("com.disrupt.savyour:id/btnContinuePhoneNumber"));
                phoneNumber.click();
                System.out.println("I am in child class..");

                String bypassNumber = "3018262530";

                WebElement phoneField = driver.findElement(By.id("com.disrupt.savyour:id/edt_phone"));
                phoneField.sendKeys(bypassNumber);
                System.out.println("Number Entered..");

                driver.findElement(By.id("com.disrupt.savyour:id/btn_request_otp")).click();


                driver.findElement(By.id("com.disrupt.savyour:id/etOtpOne")).sendKeys("1");
                driver.findElement(By.id("com.disrupt.savyour:id/etOtpTwo")).sendKeys("2");
                driver.findElement(By.id("com.disrupt.savyour:id/etOtpThree")).sendKeys("0");
                driver.findElement(By.id("com.disrupt.savyour:id/etOtpFour")).sendKeys("1");
                driver.findElement(By.id("com.disrupt.savyour:id/etOtpFive")).sendKeys("0");
                //driver.findElement(By.id("com.disrupt.savyour:id/btn_verify")).click();
                driver.findElement(By.id("com.disrupt.savyour:id/txt_chat_desc")).click(); //to skip the coachmack

            }

        }
        catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e){
            System.out.println((e.getMessage()));
            System.out.println("Already Logged In..");
        }


        try {

            Boolean poster = driver.findElement(By.className("com.urbanairship.android.layout.widget.WeightlessLinearLayout")).isDisplayed();
            if (poster){
                driver.findElement(By.className("android.widget.ImageButton")).click();
                System.out.println("Poster canceled..");
                                    }
        } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e) {
            System.out.println(e.getMessage());
            System.out.println("Poster Not found");
        }



        driver.findElement(By.id("com.disrupt.savyour:id/searchBar")).click();
        driver.findElement(By.id("com.disrupt.savyour:id/searchBar")).click();
        String brandName = "Infinity";
        driver.findElement(By.id("com.disrupt.savyour:id/searchBar")).sendKeys(brandName);
        driver.findElement(By.id("com.disrupt.savyour:id/recentSearchLayout")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Infinity ShopMarts']")).click();
        driver.findElement(By.id("com.disrupt.savyour:id/root")).click();



    }
}



