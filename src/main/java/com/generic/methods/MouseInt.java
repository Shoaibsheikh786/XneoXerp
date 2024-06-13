package com.generic.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseInt {
	
	
	public static void hoverOverElement(WebDriver driver, WebElement element) {
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).perform();
	}

}
