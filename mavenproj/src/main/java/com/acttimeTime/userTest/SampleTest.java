package com.acttimeTime.userTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;
public class SampleTest {
	@Test
	public void login(XmlTest t){
		FirefoxProfile p= new FirefoxProfile();
		p.setAssumeUntrustedCertificateIssuer(false);
		WebDriver d=new FirefoxDriver();
		d.get(t.getParameter("url"));
		d.findElement(By.xpath(".//*[@id='username']")).sendKeys(t.getParameter("username"));
		d.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys(t.getParameter("password"));
		d.findElement(By.xpath(".//*[@id='loginButton']/div")).click();
		
		{
	}

}}
