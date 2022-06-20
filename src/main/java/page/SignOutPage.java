package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignOutPage {
    private static SelenideElement logOut = $(".logout");

    public static void LogOut() {
        logOut.click();
    }

}
