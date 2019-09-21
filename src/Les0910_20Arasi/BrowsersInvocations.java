package Les0910_20Arasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersInvocations {
    public static void main (String Args[]) {
        for (int i = 0; i <4 ; i++) {
            Chrome();
            Firefox();
        }

        int j=1;
        while (j<4) {
            Chrome();
            Firefox();
            j++;
        }

    }
    public static void Chrome ()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BaYeS\\Downloads\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get ("http://skyscanner.com");
    }
    public static void Firefox ()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\BaYeS\\Downloads\\cgeckodriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get ("http://kayak.com");
    }

}
