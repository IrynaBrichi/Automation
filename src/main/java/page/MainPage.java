package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public static SelenideElement signInButton = $(".login");
    static String mainP = ("http://automationpractice.com/index.php");
    public static SelenideElement dressTab = $("#block_top_menu > ul > li:nth-child(2) > a");
    public static SelenideElement summerDress = $("#block_top_menu > ul > li:nth-child(2) > " +
            "ul > li:nth-child(3) > a");
    public static void clickSignIn() {
        signInButton.click();
    }
    public static void selectSummerDress() {
        dressTab.hover();
        summerDress.click();
    }
}
