package com.generic.methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dd {
	
    public static void selectByVisibleText(WebElement dropdownElement, String visibleText) {
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText);
    }

}
