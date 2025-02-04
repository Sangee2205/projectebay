package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.PageLocators;

import java.util.List;

public class SearchResultsPage extends PageLocators {
    WebDriver driver;
    WebDriverWait wait;

   

    public SearchResultsPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        Thread.sleep(20);
        PageFactory.initElements(driver, this);
    }

    public void clickFirstItem() {
    	{ try
    	{
    		
//    		wait.until(ExpectedConditions.elementToBeClickable(firstBook)); 
    		
    		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstBook);
    		
    		((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstBook); 
    		
    		System.out.println("Successfully clicked on the first book."); 
    		}
    	catch (Exception e) {
    		System.out.println("Error clicking on the first book: " + e.getMessage()); 
}

    }
}
}
