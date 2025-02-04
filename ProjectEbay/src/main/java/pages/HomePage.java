package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

public class HomePage {
    WebDriver driver;

    @FindBy(id = "gh-ac") 
    private WebElement searchBox;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize elements
    }

    public void searchForItem(String item) {
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.ENTER);  // Press Enter instead of clicking the button
    }
}
