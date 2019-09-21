package Les0910_20Arasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
    public static WebDriver hacibaba;

    public static void main(String[] args) throws InterruptedException {
        String expectedValue="Sizin İçin Buradayız!";

        invokeChromeBrowser();
        hacibaba.manage().window().maximize();
        hacibaba.get("http://www.flypgs.com");
        // Thread.sleep("")
        hacibaba.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/label")).click();
        Thread.sleep(2000);
        hacibaba.findElement(By.linkText("BİZE YAZIN")).click();
        Thread.sleep(2000);
        System.out.println("Validation"+isTextTrue(expectedValue));
    }

    public static void invokeChromeBrowser () {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaYeS\\Downloads\\chromedriver.exe");
    hacibaba=new ChromeDriver();
    }

    public static boolean isTextTrue (String expectedValue) {
        String resultValue=hacibaba.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return resultValue.equals(expectedValue);
    }
}
