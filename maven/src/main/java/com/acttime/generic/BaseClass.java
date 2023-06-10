package com.acttime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.acttime.pom.HomeLogin;
import com.acttime.pom.loginpage;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	public static WebDriver driver;
@BeforeTest

public void openbrowser() throws IOException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
FilLibcls f=new FilLibcls();
driver.get(f.getproperty("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
}

@BeforeMethod

public void login() throws IOException {
	FilLibcls f=new FilLibcls();
loginpage l=new loginpage();
l.getUntbx().sendKeys(f.getproperty("username"));
l.getPwtbx().sendKeys(f.getproperty("password"));
l.getLgbtn().click();
}

@AfterMethod
public void logout() {
	HomeLogin h=new HomeLogin();
	h.getLogbtn().click();
	
}
@AfterTest
public void closebrowser() {
	driver.close();
}

}
