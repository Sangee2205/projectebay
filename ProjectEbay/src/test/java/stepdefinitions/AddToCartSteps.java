package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.ProductPage;
import pages.CartPage;
import utils.BaseClass;

public class AddToCartSteps {
    WebDriver driver;
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;
    CartPage cartPage;

    @Given("I open the eBay homepage")
    public void i_open_the_ebay_homepage() throws InterruptedException {
        BaseClass.initialize();
        driver = BaseClass.driver;
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        driver.get("https://www.ebay.com");
    }

    @When("I search for {string} and press Enter")
    public void i_search_for_and_press_enter(String item) {
        homePage.searchForItem(item);
    }

    @When("I click on the first book in the search results")
    public void i_click_on_the_first_book_in_the_search_results() {
        searchResultsPage.clickFirstItem();
    }

    @When("I add the book to the cart")
    public void i_add_the_book_to_the_cart() throws Throwable {
//     productPage.addToCart();
        CartPage.goToCart();
    }

    @Then("I should see the cart updated with {string} item")
    public void i_should_see_the_cart_updated(String expectedCount) {
        cartPage.verifyCartCount(expectedCount);
        BaseClass.closeBrowser();
    }
}
