package com.jos.dem.springboot.appium.jugoterapia;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class CucumberTest {}
