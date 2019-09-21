package Les0921_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

    static WebDriver sean;
    public static void main(String[] args) throws InterruptedException {
    invokeChrome();
    sean.get("https://www.turkishairlines.com/");
    Thread.sleep(3000);
    sean.findElement(By.className("thyHeaderLink")).click();

    }

    public static void invokeChrome () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaYeS\\Downloads\\chromedriver.exe");
        sean = new ChromeDriver();
    }
}

