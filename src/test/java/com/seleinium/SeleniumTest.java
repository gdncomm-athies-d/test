package com.seleinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.latest.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.selenium.Pages.TablePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import java.util.List;

public class SeleniumTest extends BaseTest {

  WebDriver driver;

  @Test(groups = {"login"})
  public void basicLoginTest() throws InterruptedException {
    driver = getDriver();
    driver.get("https://the-internet.herokuapp.com/tables");

    TablePage tablePage = new TablePage(driver);
    tablePage = PageFactory.initElements(driver, TablePage.class);
    tablePage.printAllValues();


  }
}
