import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.webdriver.Title;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Selenide.getUserAgent;
import static java.nio.channels.SocketChannel.open;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    public void openPage() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brychkouskaya_IA\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Brychkouskaya_IA\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver1 = new FirefoxDriver();
        String baseURL = "https://www.google.com";
        String ExpectedTitle = "Google";
        String ActualTitle = "";
        //driver.get(baseURL);
        driver1.get(baseURL);
        //ActualTitle = driver.getTitle();
        ActualTitle = driver1.getTitle();
        if (ActualTitle.contentEquals(ExpectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        //driver.close();
        driver1.close();
    }

    @Test
    public void OpenPage2 () {
       open("https://www.google.com");
    }
}



