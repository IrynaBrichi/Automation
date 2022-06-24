import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement signInButton = $(".login");

    public void clickSignIn() {
        signInButton.click();
    }
}
