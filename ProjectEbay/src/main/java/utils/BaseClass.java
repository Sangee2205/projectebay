package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.Set;

public class BaseClass {
    public static WebDriver driver;

    public static void initialize() {
        if (driver == null) {
            System.out.println("Initializing WebDriver...");
            WebDriverManager.chromedriver().setup();  
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println("WebDriver Initialized Successfully.");
        }
    }

    public static void closeBrowser() {
        if (driver != null) {
            System.out.println("Closing WebDriver...");
            driver.quit();
            driver = null; 
        }
    }
        public static void window_handle() throws Throwable {
        	String mainWindow=driver.getWindowHandle();
        	Set<String> allWindows=driver.getWindowHandles();
        	String newWindow;
        	for(String windowHandle : allWindows) {
        		if(!windowHandle.equals(mainWindow)) {
        			newWindow= windowHandle;
        			driver.switchTo().window(newWindow);
        			break;
        			
        		}
        	}
        	Thread.sleep(30);
        	driver.close();
        	driver.switchTo().window(mainWindow);
        	
        }
    
    
    
}
