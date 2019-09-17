import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLocatorId {

    static WebDriver driver;

    public static void main(String[] args) {
        firefox();
        driver.get("http://www.skyscanner.com");
        try{ Thread.sleep(5000);} catch (Exception e) {}
        driver.findElement(By.id("fsc-origin-search")).clear();
        // driver.findElement (this is a method)
        driver.findElement(By.id("fsc-origin-search")).sendKeys("Denver");
        driver.findElement(By.id("fsc-destination-search")).sendKeys("Istanbul");


    }

    // invokes firefox
    public static void firefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\BaYeS\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();

    }
}
