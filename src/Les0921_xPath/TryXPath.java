package Les0921_xPath;

import Les0910_20Arasi.NameLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryXPath {
    public static void main(String[] args) throws InterruptedException {

        ChromeBrowserCommon myBrowser=new ChromeBrowserCommon();
        WebDriver driver=myBrowser.invokeChrome();
        driver.get("https://www.skyscanner.com/");
        Thread.sleep(3000);
        //we use our onw XPATH
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
