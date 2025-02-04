package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class PageLocators {
       
	@FindBy(id="gh-ac")
	public static WebElement searchBox;
	
	@FindBy(xpath="//span[@class='gh-search-button__label']")    
	public static WebElement searchButton;
	
	 @FindBy(xpath="(//a[@class='s-item__link'])[3]")
	    public static WebElement firstBook;
	 
	 
	
	    @FindBy(xpath="//span[text()='Add to cart']")
		public static WebElement goToCartButton;

	    @FindBy(xpath="//span[@class='gh-cart__icon']")
	    public static WebElement cartCount;

	     @FindBy(css = ".cart-bucket .cart-remove")
	    public static WebElement removeButton;

	    @FindBy(css = ".cart-empty-message")
	    public static WebElement emptyCartMessage;
}




