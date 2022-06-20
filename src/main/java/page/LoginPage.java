package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    static SelenideElement signIn = $(".login");
    static SelenideElement mail = $("#email");
    static SelenideElement pass = $("#passwd");
    static SelenideElement submitButton = $("#SubmitLogin");

    public static void login(String email, String passwd) {
        signIn.click();
        mail.sendKeys(email);
        pass.sendKeys(passwd);
        submitButton.click();
    }
}


