import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_IaaiSearch {

   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ChromeInvocation();
        driver.get("http://www.iaai.com");
        Thread.sleep(1500);
        driver.findElement(By.id("txtSearch")).sendKeys("LEXUS");
        Thread.sleep(1500);
        driver.findElement(By.id("btnSearch")).sendKeys(Keys.ENTER);


        Thread.sleep(2000);
        driver.navigate().to("http://amazon.com");
        Thread.sleep(1500);
        System.out.println("Sonucu buraya yaz : " + driver.findElement(By.xpath("//*[@id='nav-orders']/span[2]")).getText());
        //*[@id="nav-orders"]/span[2]
    }

    public static void ChromeInvocation() {
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\BaYeS\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}


