package org.selenium.Pages;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class TablePage {

  public  static WebDriver driver;
  public TablePage(WebDriver driver){
    this.driver = driver;
  }

  @FindBy(xpath = "//table[@id='table1']//tr")
  List<WebElement> rows;

  @FindBy(xpath = "//table[@id='table1']//tr[1]//td")
  List<WebElement> columns;

  @FindBy(xpath = "//table[@id='table1']")
  WebElement table;

  public void printAllValues() {
    Assert.assertTrue(table.isDisplayed(),"Table is not found");

    for(int r = 1 ; r< rows.size();r++){
      for(int c = 1 ;c< columns.size();c++){
        WebElement data = driver.findElement(By.xpath(String.format("//table[@id='table1']//tr[%d]//td[%d]",r,c)));
        System.out.print(data.getText()+" ");
        System.out.println("Hi");
        System.out.println("Hello");
        System.out.print(" ");
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
