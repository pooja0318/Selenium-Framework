package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class MyListPage extends TestBase{
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span")
	WebElement MyAccount;
	
	@FindBy(linkText="My lists")
	WebElement list;
	
	
	
	//initializing the page object
		public MyListPage()
		{
			PageFactory.initElements(driver, this); 
			
		}
		public MyShoppingList myAccountClick3() throws InterruptedException
		{
			Actions action= new Actions(driver);
			action.moveToElement(MyAccount).build().perform();
			Thread.sleep(5000);
			list.click();
			//Thread.sleep(5000);
			return new MyShoppingList();
		}


}