package com.kite.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement username; 
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//label[text()='PIN']")
	private WebElement pin;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement pincontinue;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Password should be minimum 6 characters.']")
	private WebElement errormessage;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void username()
	{
		username.sendKeys("EP8702");
	}
	
	public void password()
	{
		password.sendKeys("Saurabh@17");
	}
	
	public void pin()
	{
		pin.sendKeys("956596");
	}
	
	public void pincontinue()
	{
		pincontinue.click();
	}
	
	public void loginbutton()
	{
		loginButton.click();
	}
	
	public String errormessage()
	{
		String x = errormessage.getText();
		return x;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
