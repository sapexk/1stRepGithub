package Les0924T_Css_Xpath;

import Les0921_xPath.ChromeBrowserCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CssSelectorId {

    public static void main(String[] args) throws InterruptedException {
        ChromeBrowserCommon myBrowser = new ChromeBrowserCommon();
        WebDriver driver = myBrowser.invokeChrome();

        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys("Atlanta");
        for (int i = 0; i < 4; i++) {
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id='package-destination-hp-package']")).sendKeys("Las Vegas");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#package-origin-hp-package[aria-owns='typeaheadDataPlain']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#package-origin-hp-package[aria-owns='typeaheadDataPlain'][type='text']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id*='ting-hp-pac'][data-gcw-field-type='departing date'][data-min-range-length='1']")).sendKeys("10/10/2019");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-returning-hp-package")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-returning-hp-package")).sendKeys("11/11/2019");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#partialHotelBooking-hp-package")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button#search-button-hp-package")).click();
    }
}

