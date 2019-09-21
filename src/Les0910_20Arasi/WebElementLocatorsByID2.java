package Les0910_20Arasi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementLocatorsByID2 {

    public static WebDriver driver;

    public static void main(String args[]) throws InterruptedException {
        fireFoxInvocation();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);

        driver.findElement(By.id("package-origin-hp-package")).sendKeys("H");
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        driver.findElement(By.id("package-destination-hp-package")).sendKeys("I");
        Thread.sleep(2000);
        driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.id("package-departing-hp-package")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("package-departing-hp-package")).sendKeys("11/02/2019");
        Thread.sleep(2000);

        driver.findElement(By.id("package-returning-hp-package")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.chord(Keys.CONTROL, "A"));
        driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        driver.findElement(By.id("package-returning-hp-package")).sendKeys("11/17/2019");
        Thread.sleep(2000);

        driver.findElement(By.id("search-button-hp-package")).click();

    }

    public static void fireFoxInvocation() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\BaYeS\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();

    }
}
