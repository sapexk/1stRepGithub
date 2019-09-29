package Les0929SN_Explicit;

import Les0921_xPath.ChromeBrowserCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

    public static void main(String[] args) throws InterruptedException {
        ChromeBrowserCommon myBrowser = new ChromeBrowserCommon();
        WebDriver driver = myBrowser.invokeChrome();

        driver.get("http://expedia.com");

        WebDriverWait wait=new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#tab-flight-tab-hp"))));
        driver.findElement(By.id("tab-flight-tab-hp")).click();

        //click hotel button
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("tab-hotel-tab-hp")));
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("tab-hotel-tab-hp")));
        driver.findElement(By.id("tab-hotel-tab-hp"));

        //click Bundle ans Save
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"))));
        driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"));

        //hotel destination Invisibility
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("hotel-destination-hp-hotel"))));

        System.out.println("The input of hotel is insvisible");


    }
}
