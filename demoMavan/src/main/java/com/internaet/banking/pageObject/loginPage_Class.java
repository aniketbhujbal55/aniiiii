package com.internaet.banking.pageObject;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_Class {
	WebDriver driver;
	public loginPage_Class(){
		PageFactory.initElements(driver, this);
		}
  @FindBy(className = "name=\"uid\"")
  WebElement Uname;
  @FindBy(className = "name=\"password\"")
  WebElement Pass;
  @FindBy(className = "name=\"btnLogin\"")
  WebElement button;
  
  public void usenamee(String U) {
	  Uname.sendKeys(U);
  }
  public void passwordd(String P) {
	  Pass.sendKeys(P);
  }
  public void loginbutton() {
	  button.click();
  }
	

}
