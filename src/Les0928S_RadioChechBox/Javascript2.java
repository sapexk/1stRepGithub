package Les0928S_RadioChechBox;

import Les0921_xPath.ChromeBrowserCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Javascript2 {

    public static void main(String[] args) throws InterruptedException {
        ChromeBrowserCommon myBrowser = new ChromeBrowserCommon();
        WebDriver driver = myBrowser.invokeChrome();

        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[type=button]")).click();
        Thread.sleep(2000);

        String expectedValue = "Are you sure you want to give us the deed to your house?";

        if (expectedValue.contains(driver.switchTo().alert().getText())) {
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
        }
    }
}
