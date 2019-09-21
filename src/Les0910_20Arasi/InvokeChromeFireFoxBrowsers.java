package Les0910_20Arasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeChromeFireFoxBrowsers {
    public static void main(String[] args) {
        firefox();
        chrome();
    }
    public static void chrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaYeS\\Downloads\\chromedriver.exe");
        WebDriver shan = new ChromeDriver();
        //shan.get("http://www.amazon.com");
        //shan.get("http://www.facebook.com");
        shan.get("http://www.ebay.com");
    }
    public static void firefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\BaYeS\\Downloads\\geckodriver.exe");
        WebDriver shan2 = new FirefoxDriver();
        shan2.get("http://www.google.com");
    }
}


