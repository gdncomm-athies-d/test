package com.seleinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

  public static WebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void beforeMethod() {
    System.out.println("Before methods");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod() {
    System.out.println("After methods");
    driver.quit();
  }

  public WebDriver getDriver() {
     return driver;
  }

}
