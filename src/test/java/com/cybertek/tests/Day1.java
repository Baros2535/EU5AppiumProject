package com.cybertek.tests;

import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Day1 {

    @Test
    public void test1(){
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        //we use android
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //our version
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"12.0");
        //device name
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_3a");

        //either you specfy app
        


    }

}
