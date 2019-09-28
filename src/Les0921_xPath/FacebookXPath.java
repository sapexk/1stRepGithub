package Les0921_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookXPath {

    public static void main(String[] args) throws InterruptedException {

        ChromeBrowserCommon myBrowser=new ChromeBrowserCommon();
        WebDriver driver=myBrowser.invokeChrome();
        //Thread.sleep(3000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("i");
        //we use our onw XPATH
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pwd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@type,'mai']")).sendKeys("contains mai");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@type,'ema']")).sendKeys("starts with emai");
    }

}
