import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
    ChromeDriver driver;

    @BeforeTest
    public void openUrl() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 0,enabled = true)
    public void userLogin() throws InterruptedException {
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
    }

    @Test(priority = 1,dependsOnMethods = {"userLogin"})
    public void userCanByeFromWebsite() {
        System.out.println(driver.getCurrentUrl());
    }

    @AfterTest
    public void closeWebsite() {
        driver.quit();
    }
}

