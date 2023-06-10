package com.acttime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttime.generic.BaseClass;

public class HomeLogin extends BaseClass {
	@FindBy(id = "logoutLink")
	private WebElement logbtn;
	
	@FindBy(id = "container_tasks")
	private WebElement taskbtn;
	
	public HomeLogin() {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getLogbtn() {
		return logbtn;
	}

	public WebElement getTaskbtn() {
		return taskbtn;
	}

}
