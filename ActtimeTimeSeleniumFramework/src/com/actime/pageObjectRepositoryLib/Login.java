package com.actime.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericLib.Constants;
import com.acttime.genericLib.Driver;
import com.acttime.genericLib.WebDriverCommonLib;

public class Login extends WebDriverCommonLib{

	
	@FindBy(name="username")
	private WebElement userNameEdt;
		
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	public void login(String userName , String password){		
		Driver.driver.get(Constants.url);
		userNameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		loginBtn.click();
		waitForPageToLoad();
	}
	
	
}
