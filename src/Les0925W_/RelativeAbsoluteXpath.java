package Les0925W_;

import Les0921_xPath.ChromeBrowserCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RelativeAbsoluteXpath {
    public static void main(String[] args) throws InterruptedException {
        ChromeBrowserCommon myBrowser = new ChromeBrowserCommon();
        WebDriver driver = myBrowser.invokeChrome();

        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form[@id='gcw-packages-form-hp-package']/section/div/div/div/label/input")).sendKeys("Atlanta");
        
    }
}