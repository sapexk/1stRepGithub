package Les0910_20Arasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocator {

    static WebDriver dandanakan;

    public static void main(String[] args) {
        invokeFirefoxBrowser();
        dandanakan.get("http://facebook.com");
        dandanakan.findElement(By.name("firstname")).sendKeys("Yavuzdere");
        dandanakan.findElement(By.name("lastname")).sendKeys("Yepareparce");
    }

    public static void invokeFirefoxBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\BaYeS\\Downloads\\geckodriver.exe");
        dandanakan = new FirefoxDriver();
    }
}
