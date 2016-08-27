package com.acttime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	public void waitForPageToLoad(){
		Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
   public void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
		wait.until(ExpectedConditions.
	 presenceOfElementLocated(By.xpath(wbXpath)));
		
   }
   public void waitForNamePresent(String wbName){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
		wait.until(ExpectedConditions.
	 presenceOfElementLocated(By.name(wbName)));
		
   }
   public void waitForIDPresent(String wbID){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
		wait.until(ExpectedConditions.
	 presenceOfElementLocated(By.id(wbID)));
		
   }
	
	
	
	
	
	
}
