package com.acttime.projectAndCustomerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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

public class ProjectAndCustomer {
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
	public void createcustomerTest() {
		System.out.println("create customer");
	}
	
	@Test
	public void modifyCustomerTest() {
		System.out.println("modify customer");

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





