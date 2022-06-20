import base.BaseTest;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import enums.Feature;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;
import page.BlousesPage;
import page.CreateAccountPage;
import services.ui.ScreenshotService;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static page.BlousesPage.*;
import static page.CustomerServicePage.customerServiceContactUsPage;
import static page.LoginPage.login;
import static page.MainPage.selectSummerDress;
import static page.MainPage.signInButton;
import static page.MyAccountPage.*;
import static page.SummerDressPage.*;
import static page.TshirtPage.*;
import static services.ui.ScreenshotService.uiExecutor;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Execution(ExecutionMode.SAME_THREAD)

public class TestCases extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test
    @Order(1)
    public void testOpenMainPage() {
        open("http://automationpractice.com/index.php");
        mainPage.clickSignIn();
        Assertions.assertTrue(signInButton.isDisplayed(), "Login page was not opened!");
    }

    @Test
    @Order(2)
    public void createAccount() {
        Configuration.browserSize = "1920x1080";
        Selenide.open("http://automationpractice.com/index.php");
        uiExecutor($("#htmlcontent_top > ul > li.htmlcontent-item-1.col-xs-4 > a > img"), Feature.EXAMPLE, By.cssSelector(".login"));
        mainPage.clickSignIn();
        uiExecutor(Feature.EXAMPLE_2);
        LoginPage loginPage = new LoginPage();
        CreateAccountPage createAccountPage = loginPage.login("ira@gmail.com");
        createAccountPage.createAccount("Irina", "Bri", "qwerty6", "qa", "qa1");
    }


    @Test
    @Order(3)
    public void OrderCheck() {
        Selenide.open("http://automationpractice.com/index.php");
        mainPage.clickSignIn();
        OrderCheckPage orderCheckPage = new OrderCheckPage();
        OrderCheckPage.OrderCheck("i123@gmail.com", "12345");
    }

    @Test
    @Order(4)
    public void sendEmailToCustomerService() {
        String expectedMessage = "Your message has been successfully sent to our team.";
        Selenide.open("http://automationpractice.com/index.php");
        mainPage.clickSignIn();
        OrderCheck();
        customerServiceContactUsPage();
        Assertions.assertTrue(Selenide.$(".alert.alert-success").getText().contains(expectedMessage));
    }

    @Test
    @Order(5)
    public void writeReview() {
        Selenide.open("http://automationpractice.com/index.php");
        mainPage.clickSignIn();
        login("i123@gmail.com", "12345");
        selectTshirt();
        tshirtHoverAndClickMore();
        writeReviewBtn();
        writeReviewText();
        windowClose();
        assertEquals(
                "New comment\n" +
                        "Your comment has been added and will be available once approved by a moderator\n" +
                        "\n" +
                        "OK",
                $(".fancybox-inner").getText());
        okBtn();

    }

    @Test
    @Order(6)
    public void blouseToWishlist() {
        Selenide.open("http://automationpractice.com/index.php");
        mainPage.clickSignIn();
        login("i123@gmail.com", "12345");
        blousesPage();
        moreBtn();
        addToWish();
        myAccountOpen();
        myWishListOpen();
        myFirstWishClick();
        deleteMyWish();
        Assertions.assertFalse($("#block-history > table").isDisplayed());
    }

    @Test
    public void selectDressColour() {
        Selenide.open("http://automationpractice.com/index.php");
        selectSummerDress();
        selectPrintedSummerDressesWithFourColor();
        uiExecutor(Feature.EXAMPLE);
        uiExecutor(Feature.EXAMPLE);
        selectBlackColor();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
        selectOrangeColor();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
        selectBlueColor();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
        selectYellowColor();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());

    }
}
