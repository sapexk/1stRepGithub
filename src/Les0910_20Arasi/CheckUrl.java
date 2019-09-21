package Les0910_20Arasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.swing.*;

public class CheckUrl {

    public static String url = "https://www.ebay.com";
    public static WebDriver driver;

    public static void main(String args[]) {
        chrome();
        boolean result = urlValidation(url);
        System.out.println("Validation: " + result);
    }

    public static void chrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaYeS\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static boolean urlValidation(String url) {
        if (url.equals(driver.getCurrentUrl()))
        {
            return true;
        }
        else {
            return false;
        }
    }
}

