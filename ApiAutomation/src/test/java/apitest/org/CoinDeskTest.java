package apitest.org;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CoinDeskTest {

    @Test
    public void validateBPIResponse() {
       
        String endpoint = "https://api.coindesk.com/v1/bpi/currentprice.json";

       
        Response response = RestAssured.get(endpoint);


        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200");

    
        String jsonResponse = response.getBody().asString();
        Assert.assertTrue(jsonResponse.contains("\"USD\""), "USD not found in response");
        Assert.assertTrue(jsonResponse.contains("\"GBP\""), "GBP not found in response");
        Assert.assertTrue(jsonResponse.contains("\"EUR\""), "EUR not found in response");

        
        String gbpDescription = response.jsonPath().getString("bpi.GBP.description");
        Assert.assertEquals(gbpDescription, "British Pound Sterling", "GBP description mismatch");
    }
}