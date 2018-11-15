package com.jos.dem.springboot.appium.jugoterapia;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jos.dem.springboot.appium.jugoterapia.service.AppiumService;

@ContextConfiguration(classes = AppiumJugoterapiaApplication.class)
@WebAppConfiguration
public class BaseStep {

  @Autowired
  private AppiumService appiumService;

  DesiredCapabilities getCapabilities(){
    return appiumService.getCapabilities();
  }

}
