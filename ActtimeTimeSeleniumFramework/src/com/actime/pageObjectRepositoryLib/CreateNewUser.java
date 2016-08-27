package com.actime.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericLib.WebDriverCommonLib;

public class CreateNewUser extends WebDriverCommonLib{

	@FindBy(name="username")
	private WebElement userNameEdt;
	
	@FindBy(name="firstName")
	private WebElement fName;
	
	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(name="email")
	private WebElement emailEdt;

	@FindBy(name="passwordText")
	private WebElement passwordEdt;
	
	@FindBy(name="passwordTextRetype")
	private WebElement rePasswordEdt;

   @FindBy(xpath="//input[contains(@value,'Create')]")
   private WebElement createUserBtn;
   
   public void createUser(String userN, String fName, String lName
		                 , String email, String userPassword){
	   userNameEdt.sendKeys(userN);
	   this.fName.sendKeys(fName);
	   this.lName.sendKeys(lName);
	   emailEdt.sendKeys(email);
	   passwordEdt.sendKeys(userPassword);
	   rePasswordEdt.sendKeys(userPassword);
	   createUserBtn.click();
	   waitForPageToLoad();
	   
   }

}







