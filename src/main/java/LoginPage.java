import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {



    public static SelenideElement email = $("#email_create");
    public static SelenideElement submitButton = $("#SubmitCreate");

    public CreateAccountPage login (String mail) {
        email.setValue(mail);;
        submitButton.click();
        return new CreateAccountPage();

    }
}


