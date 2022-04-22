 package com.kite.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kite.POMClasses.LoginPage;

public class TX01LoginFunctionality extends BaseClass
{
		@Test
		public void verifyloginFunctionality()
		{
		LoginPage lp = new LoginPage(driver);
		String actualurl = "https://kite.zerodha.com/dashboard";
		String expectedurl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedurl, actualurl);
		log.info("test case TX01 is executed");
		
		}

}
