package com.jos.dem.springboot.appium.jugoterapia;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import com.jos.dem.springboot.appium.jugoterapia.service.AppiumService;

@ContextConfiguration(classes = AppiumJugoterapiaApplication.class)
@WebAppConfiguration
public class BaseTest {

  @Value("${appium.server}")
  private String appiumServer;
  @Value("${appium.wait}")
  private Long appiumWait;
  @Value("${appium.timeout}")
  private Long appiumTimeout;

  @Autowired
  private AppiumService appiumService;
  private AndroidDriver<AndroidElement> driver;

  public AndroidDriver<AndroidElement> getDriver() throws MalformedURLException {
    if(driver == null){
      driver = new AndroidDriver(new URL(appiumServer), appiumService.getCapabilities());
      driver.manage().timeouts().implicitlyWait(appiumWait, TimeUnit.SECONDS);
    }
    return driver;
  }

  public AndroidElement waitForElement(AndroidElement element){
    WebDriverWait wait =  new WebDriverWait(driver, appiumTimeout);
    wait.until(ExpectedConditions.visibilityOf(element));
    return element;
  }

  DesiredCapabilities getCapabilities(){
    return appiumService.getCapabilities();
  }

}
