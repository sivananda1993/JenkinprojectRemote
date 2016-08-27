package com.acttime.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

	public static WebDriver driver;

	public static WebDriver getBrowser(){
		if(Constants.browser.equals("firefox")){
		    driver = new FirefoxDriver();
		}else if(Constants.browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\advanced\\ActtimeTimeSeleniumFramework\\TestData\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if(Constants.browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\advanced\\ActtimeTimeSeleniumFramework\\TestData\\chromedriver.exe");
			driver = new ChromeDriver();
		}else{
			driver = new FirefoxDriver();
		}
		 return driver;
	}
}
