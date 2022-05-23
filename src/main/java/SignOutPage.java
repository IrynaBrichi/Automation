import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SignOutPage {
    private static SelenideElement logOut = $(".logout");

    public static void LogOut() {
        logOut.click();
    }

}
