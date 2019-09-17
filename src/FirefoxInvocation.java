import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvocation {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\BaYeS\\Downloads\\geckodriver.exe");
        WebDriver shan2=new FirefoxDriver();
        shan2.get("http://www.amazon.com");
    }
}
