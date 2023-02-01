package com.crm.Generic_utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver_utility {
	
	/*
	 * This is implicit wait for page load
	 * @param driver
	 * @author vishwa
	 */
	public void waitforpageload(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
/*
 * This is generic method for explicitwait
 * @param driver
 * @param element
 */
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/*
	 * To select the option from the listbox using index
	 * @param element
	 * @param i
	 */
	public void selectOption(RemoteWebElement element,int i) {
		Select s=new Select(element);
				s.selectByIndex(i);
	}
	/*
	 * To select the option from listbox using visible text
	 * @param element
	 * @param text
	 * @author vishwa
	 */
	public void selectOption(RemoteWebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	/*
	 * Used to switch to any window based on window title
	 * @param driver
	 * @param partialwindowtitle
	 * @author vishwa
	 */
	public void switchToWindow(WebDriver driver,String PartialWindowTitle)
	{
	Set<String> allId = driver.getWindowHandles();
	Iterator<String> it=allId.iterator();
	while(it.hasNext())
	{
	String wid = it.next();
	driver.switchTo().window(wid);
	String Title=driver.getTitle();
	if(Title.contains(PartialWindowTitle))
	{
	break;
	}
	}
	}
	
	/*
	 * used to switch to frame window based on index
	 * @param driver
	 * @param index
	 * @author vishwa
	 */
	public void switchToframe(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/*
	 * used to handle  alert and accept
	 * @param driver
	 * 2author vishwa
	 */
	public void switchToAlertAndAccepet(WebDriver driver)
	{
	driver.switchTo().alert().accept();;	
	}
	/*
	 * used to handle mouse action
	 * @param driver
	 * @param element
	 * @author vishwa
	 */
	public void moveToElement(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
 
	public void WaitForElement(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void Windowmax(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}
	
	public void Handlepopup(WebDriver driver) 
	{
		driver.switchTo().alert().accept();
	}
	
	}
