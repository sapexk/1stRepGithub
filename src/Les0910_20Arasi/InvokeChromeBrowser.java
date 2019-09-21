package Les0910_20Arasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChromeBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaYeS\\Downloads\\chromedriver.exe");
        WebDriver shan = new ChromeDriver();
        //shan.get("http://www.amazon.com");
        //shan.get("http://www.facebook.com");
        shan.get("http://www.ebay.com");
    }
}


