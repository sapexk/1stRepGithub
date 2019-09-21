package Les0921_xPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserCommon {

    public WebDriver invokeChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaYeS\\Downloads\\chromedriver.exe");
        WebDriver chromeDriverCommon = new ChromeDriver();
        return chromeDriverCommon;
    }
}
