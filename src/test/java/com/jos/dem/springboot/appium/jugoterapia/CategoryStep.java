package com.jos.dem.springboot.appium.jugoterapia;

import java.util.Date;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CategoryStep extends BaseStep {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @When("I launch the application")
  public void shouldLaunchApplication() throws Exception {
    log.info("Running: I launch the application at " + new Date().getTime());
  }

  @Then("I should be able to see capabilities")
  public void shouldBeAbleToSeeCapabilities() throws Exception {
    log.info("Running: I should be able to see capabilities at " + new Date().getTime());
  }

}
