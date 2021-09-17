package com.cybertek.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;

public class Day1 {
AppiumDriver<MobileElement> driver;
    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        //we use android
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //our version
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"12.0");
        //device name
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_3a");

        //either you specfy app

        desiredCapabilities.setCapability("appPackage", "com.android.camera2");
        desiredCapabilities.setCapability("appActivity", "com.android.camera.CameraActivity");

        driver=new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(3000);

        driver.closeApp();



    }


@Test
    public void calculator1() throws MalformedURLException, InterruptedException {

    DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
    //we use android
    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    //our version
    desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"12.0");
    //device name
    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_3a");

    desiredCapabilities.setCapability("appPackage", "me.lam.calculatorvault");
    desiredCapabilities.setCapability("appActivity", ".activity.CalculatorActivity");

    driver=new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
    Thread.sleep(3000);
    driver.findElement(By.id("android:id/text1")).sendKeys("1234");
    driver.findElement(By.id("android:id/text2")).sendKeys("1234");
    driver.findElement(By.id("android:id/button1")).click();
    driver.findElement(By.id("android:id/button1")).click();

  String seven=  driver.findElement(By.xpath("*//*[@text='7']")).getText();
  //click 7
    driver.findElement(By.xpath("*//*[@text='7']")).click();
    //click +
    driver.findElement(By.xpath("*//*[@text='+']")).click();
    //click 6
    driver.findElement(By.xpath("*//*[@text='6']")).click();
    //click =
    driver.findElement(By.xpath("*//*[@text='=']")).click();

    // get result text


    String actualResult = driver.findElement(MobileBy.className("android.widget.EditText")).getText();
    Assert.assertEquals("13",actualResult);
    driver.closeApp();


}

    @Test
    public void calculator2() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        //we use android
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //our version
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"12.0");
        //device name
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_3a");

        desiredCapabilities.setCapability("appPackage", "me.lam.calculatorvault");
        desiredCapabilities.setCapability("appActivity", ".activity.CalculatorActivity");

        driver=new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(3000);
        driver.findElement(By.id("android:id/text1")).sendKeys("1234");
        driver.findElement(By.id("android:id/text2")).sendKeys("1234");
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.id("android:id/button1")).click();


        //click 7
        driver.findElement(By.xpath("*//*[@text='4']")).click();
        //click x
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"times\"]")).click();
        //click 6
        driver.findElement(By.xpath("*//*[@text='5']")).click();
        //click =
        driver.findElement(By.xpath("*//*[@text='=']")).click();

        // get result text


        String actualResult = driver.findElement(MobileBy.className("android.widget.EditText")).getText();
        Assert.assertEquals("20",actualResult);
        driver.closeApp();


    }


    @Test
    public void calculator3() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        //we use android
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //our version
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"12.0");
        //device name
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_3a");

        desiredCapabilities.setCapability("appPackage", "me.lam.calculatorvault");
        desiredCapabilities.setCapability("appActivity", ".activity.CalculatorActivity");

        driver=new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(3000);
        driver.findElement(By.id("android:id/text1")).sendKeys("1234");
        driver.findElement(By.id("android:id/text2")).sendKeys("1234");
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.id("android:id/button1")).click();


        //click 8
       getDigit(8).click();
        //click x
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"times\"]")).click();
        //click 6
      getDigit(6).click();
        //click =
        driver.findElement(By.xpath("*//*[@text='=']")).click();

        // get result text


        String actualResult = driver.findElement(MobileBy.className("android.widget.EditText")).getText();
        Assert.assertEquals("48",actualResult);
        driver.closeApp();


    }

    @Test
    public void installApp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        //we use android
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //our version
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"12.0");
        //device name
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_3a");

        desiredCapabilities.setCapability("app","/Users/barisaltun/Downloads/etsy.apk");

        driver=new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);

        driver.findElement(By.xpath("*//*[@text='You']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("*//*[@text='Settings']")).click();

        Thread.sleep(2000);
        driver.findElement(By.className("android.widget.CheckBox")).click();
        Thread.sleep(2000);
        Boolean bool= driver.findElement(By.className("android.widget.CheckBox")).isSelected();
        Assert.assertFalse(bool);
        Thread.sleep(3000);


driver.closeApp();


    }



    @Test
    public void realDevice() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        //we use android
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //our version
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"12.0");
        //device name
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"7f8fabe");

        desiredCapabilities.setCapability("app","/Users/barisaltun/Downloads/etsy.apk");

        driver=new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);

        driver.findElement(By.xpath("*//*[@text='You']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("*//*[@text='Settings']")).click();

        Thread.sleep(2000);
        driver.findElement(By.className("android.widget.CheckBox")).click();
        Thread.sleep(2000);
        Boolean bool= driver.findElement(By.className("android.widget.CheckBox")).isSelected();
        Assert.assertFalse(bool);
        Thread.sleep(3000);


        driver.closeApp();


    }




    public MobileElement getDigit(int a){
        String xpath="*//*[@text='"+a+"']";
       return driver.findElement(By.xpath(xpath));
    }




}
