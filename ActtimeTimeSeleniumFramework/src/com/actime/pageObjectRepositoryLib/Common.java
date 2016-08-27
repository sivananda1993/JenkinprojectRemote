package com.actime.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericLib.WebDriverCommonLib;

public class Common extends WebDriverCommonLib{

	@FindBy(id="logoutLink")
	private WebElement logoutLnk;
	
	public void logout(){
		logoutLnk.click();
		waitForPageToLoad();
	}
}
