package Les0928S_RadioChechBox;

import Les0921_xPath.ChromeBrowserCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class JavaScript {

    public static void main(String[] args) throws InterruptedException {
        ChromeBrowserCommon myBrowser = new ChromeBrowserCommon();
        WebDriver driver = myBrowser.invokeChrome();

        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("input[type='button']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}