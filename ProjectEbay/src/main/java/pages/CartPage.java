package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;
import utils.PageLocators;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.junit.Assert;	

public class CartPage extends PageLocators{
	 
	 static WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
               PageFactory.initElements(driver, this);
    }

    public static void goToCart() throws Throwable {
    	
    { try
    	{
    	String mainWindow=driver.getWindowHandle();
    	Set<String> allWindows=driver.getWindowHandles();
    	String newWindow;
    	for(String windowHandle : allWindows) {
    		if(!windowHandle.equals(mainWindow)) {
    			newWindow= windowHandle;
    			driver.switchTo().window(newWindow);
      		((JavascriptExecutor) driver).executeScript("arguments[0].click();", goToCartButton); 
    		
    		System.out.println("Successfully added to cart."); 
    		}
    	}
    	}
    	catch (Exception e) {
    		System.out.println("Error clicking add to cart: " + e.getMessage());
    	}
    	}
    }

	public void verifyCartCount(String expectedCount) {
        String actualCount = cartCount.getText();
        Assert.assertEquals("Cart count mismatch!", expectedCount, actualCount);
    }

    public void removeItemFromCart() {
        removeButton.click();
    }

    public void verifyCartIsEmpty() {
        Assert.assertTrue("Cart is not empty!", emptyCartMessage.isDisplayed());
    }
}

