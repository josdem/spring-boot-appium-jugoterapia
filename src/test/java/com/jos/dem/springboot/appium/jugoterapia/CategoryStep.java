package com.jos.dem.springboot.appium.jugoterapia;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CategoryStep extends BaseStep {

  @When("I launch the application")
  public void shouldLaunchApplication() throws Exception {
    log.info("Running: I launch the application at " + new Date().getTime());
  }
}
