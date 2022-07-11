package com.finitebanking.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;


import com.finitebanking.pageObjects.LoginPage;

public class LoginTest_001 extends BaseClass {
    @Test
	public void loginTest() throws Exception {

    logger.info("URL is opened");
 LoginPage lp=new LoginPage(driver);
 
 lp.setUserName(username);
 Thread.sleep(10000);
 logger.info("Entered username");
 lp.setPassword(password);
 Thread.sleep(10000);
 logger.info("Entered password");
 lp.clickSubmit();
 
 if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
Assert.assertTrue(true);
logger.info("Login test pass");
    }else {
    	captureScreen(driver,"loginTest");
    	Assert.assertTrue(false);
    	logger.info("Login test failed");
    }
}
}
