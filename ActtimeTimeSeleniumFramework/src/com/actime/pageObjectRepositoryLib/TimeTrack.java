package com.actime.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericLib.WebDriverCommonLib;

public class TimeTrack extends WebDriverCommonLib{

	@FindBy(xpath="//div[text()='Users']")
	private WebElement userLnk;
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement reportLnk;
	
	public void navigateToUSerPage(){
		userLnk.click();
		waitForPageToLoad();
	}
	public void navigateToReportPage(){
		waitForPageToLoad();
	}
	
}
