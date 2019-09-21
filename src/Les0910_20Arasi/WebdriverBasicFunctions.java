package Les0910_20Arasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasicFunctions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaYeS\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("The title of the page is "+ driver.getTitle());
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(10000);
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println("*********************************");
        //System.out.println(driver.getPageSource());
        driver.close();
    }
}
