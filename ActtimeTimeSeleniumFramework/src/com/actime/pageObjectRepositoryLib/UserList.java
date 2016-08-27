package com.actime.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericLib.WebDriverCommonLib;

public class UserList extends WebDriverCommonLib{

	@FindBy(xpath="//span[text()='Create New User']")
	private WebElement createNewUSerBtn;
	
	@FindBy(className="successmsg")
	private WebElement userSucMsgTxt;
	
	
	
	public WebElement getUserSucMsgTxt() {
		return userSucMsgTxt;
	}

	public WebElement getCreateNewUSerBtn() {
		return createNewUSerBtn;
	}

	public void navigateCreateNewUserPage(){
		createNewUSerBtn.click();
		waitForPageToLoad();
	}
}















