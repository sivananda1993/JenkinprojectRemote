package com.acttimeTime.userTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actime.pageObjectRepositoryLib.Common;
import com.actime.pageObjectRepositoryLib.CreateNewUser;
import com.actime.pageObjectRepositoryLib.Login;
import com.actime.pageObjectRepositoryLib.TimeTrack;
import com.actime.pageObjectRepositoryLib.UserList;
import com.acttime.genericLib.Constants;
import com.acttime.genericLib.Driver;
import com.acttime.genericLib.ExcelLib;

public class UserTest {
	//object declaration
	WebDriver driver;
	Login loginPage;
	ExcelLib eLib;
	Common cPage;
	TimeTrack tPage;
	UserList userListPage;
	CreateNewUser cUserPage;
	
	@BeforeClass
	public void configBeforeClass(){
		//object intalization
		driver = Driver.getBrowser();
		eLib = new ExcelLib();
		loginPage = PageFactory.initElements(driver, Login.class);
		cPage = PageFactory.initElements(driver, Common.class);
		tPage = PageFactory.initElements(driver, TimeTrack.class);
		userListPage = PageFactory.initElements(driver, UserList.class);
		cUserPage = PageFactory.initElements(driver, CreateNewUser.class);
	}
	
	@BeforeMethod
	public void configBeforeMtd(){
		//step 1: login to APP
		loginPage.login(Constants.userName, Constants.password);
	}
	
	
	
	@Test
	public void createUSerTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		String userID = eLib.getExcelData("Sheet1", 1, 2);
		String firstName = eLib.getExcelData("Sheet1", 1, 3);
		String lasttName = eLib.getExcelData("Sheet1", 1, 4);
		String email = eLib.getExcelData("Sheet1", 1, 5);
		String userPsw = eLib.getExcelData("Sheet1", 1, 6);
		String expectedMsg = eLib.getExcelData("Sheet1", 1, 7);
       //step 2 : navigate to User Page
		tPage.navigateToUSerPage();
	   //step 3: navigate create User page	
		userListPage.navigateCreateNewUserPage();
	   //step 4 : create User
		cUserPage.createUser(userID, firstName, lasttName, email, userPsw);
	  //step 5 : verify User
		String actMsg = userListPage.getUserSucMsgTxt().getText();
		Assert.assertEquals(actMsg, expectedMsg);
		
	}
	
	@Test
	public void modifyUserTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		String userID = eLib.getExcelData("Sheet1", 2, 2);
		String firstName = eLib.getExcelData("Sheet1", 2, 3);
		String lasttName = eLib.getExcelData("Sheet1", 2, 4);
		String email = eLib.getExcelData("Sheet1", 2, 5);
		String userPsw = eLib.getExcelData("Sheet1", 2, 6);
		String expectedMsg = eLib.getExcelData("Sheet1", 2, 7);
		 //step 2 : navigate to User Page
		tPage.navigateToUSerPage();
	   //step 3: navigate create User page	
		userListPage.navigateCreateNewUserPage();
	   //step 4 : create User
		cUserPage.createUser(userID, firstName, lasttName, email, userPsw);
	   // step 5 : mofdifyUSer	
		
	}
	
	@AfterMethod
	public void configAfterMtd(){
		cPage.logout();
	}
	
	@AfterClass
	public void configAfterClass(){
		driver.quit();
	}


}





