import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class TestCases {

    MainPage mainPage = new MainPage();

    @Test
    public void createAccount() {
        Selenide.open("http://automationpractice.com/index.php");
        mainPage.clickSignIn();
        LoginPage loginPage = new LoginPage();
        CreateAccountPage createAccountPage = loginPage.login("ira@gmail.com");
        CreateAccountPage.CreateAccount("Irina", "Bri", "qwerty6", "qa", "qa1");}

    @Test
    public void orderCheck() {
        Selenide.open("http://automationpractice.com/index.php");
        mainPage.clickSignIn();
        OrderCheckPage orderCheckPage = new OrderCheckPage();
        OrderCheckPage.OrderCheck("i123@gmail.com", "12345");

    }

}
