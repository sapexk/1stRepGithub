package Les0922S_Css;

import Les0921_xPath.ChromeBrowserCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonWholeFoodTC {

    public static void main(String[] args) throws InterruptedException {
        ChromeBrowserCommon myBrowser = new ChromeBrowserCommon();
        WebDriver driver = myBrowser.invokeChrome();

        driver.get("http://www.amazon.com");
        Thread.sleep(2000);
        // driver.findElement(By.xpath("//a[contains(text(),'Whole Foods')]")).click();
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("shoes");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.nav-input[type='submit']")).click();
    }
}
