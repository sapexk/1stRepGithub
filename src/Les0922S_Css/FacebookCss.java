package Les0922S_Css;

import Les0921_xPath.ChromeBrowserCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookCss {

    public static void main(String[] args) throws InterruptedException {
        ChromeBrowserCommon myBrowser = new ChromeBrowserCommon();
        WebDriver driver = myBrowser.invokeChrome();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        //driver.findElement(By.linkText("Forgot account?")).click();
        //driver.findElement(By.cssSelector("a[text()='Forgot account?']")).click();
        //driver.findElement(By.cssSelector("a=contains('Forgot account?')")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#identify_email")).sendKeys("2107652412");

        //driver.findElement(By.cssSelector("[type='submit']")).click();
        driver.findElement(By.cssSelector("[value='Search']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.cssSelector("[name='reset_action']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Not You?')]")).click();
        driver.findElement(By.cssSelector("input#identify_email")).sendKeys("email@email.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[value='Search']")).click();





        //driver.findElement(By.id("identify_email")).sendKeys("2107652412");
        //driver.findElement(By.cssSelector("input:contains('Search')")).click();
        //driver.findElement(By.linkText("submit")).click();
                //    ("u_0_2")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.cssSelector("input:contains('send_email')")).click();

/*
<input value="Search" type="submit" name="did_submit" id="u_0_2">
*/


       //driver.findElement(By.cssSelector("a=contains('email')")).sendKeys("email@email.com");
        /*
        <input type="text" class="inputtext" id="identify_email" name="email" placeholder="Phone or email" autofocus="1" aria-label="Phone or email">
         */
    }
}