import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/");

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.close();
    }

}
