package Les0928S_RadioChechBox;

import Les0921_xPath.ChromeBrowserCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {
        ChromeBrowserCommon myBrowser = new ChromeBrowserCommon();
        WebDriver driver = myBrowser.invokeChrome();

        driver.get("http://www.expedia.com");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).click();
        Thread.sleep(2000);

        System.out.println("is selected " + driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).isSelected());
        Thread.sleep(2000);
        Thread.sleep(2000);
    }
}
