package page;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.RandomStringUtils;

import static com.codeborne.selenide.Selenide.$;


public class CreateAccountPage {
    static SelenideElement gender = $("#uniform-id_gender1");
    static SelenideElement firstName = $("#customer_firstname");
    static SelenideElement lastName = $("#customer_lastname");
    static SelenideElement password = $("#passwd");
    static SelenideElement days = $("#days");
    static SelenideElement months = $("#months");
    static SelenideElement years = $("#years");
    static SelenideElement newsletter = $("#uniform-newsletter");
    static SelenideElement checkbox = $("#uniform-optin");
    static SelenideElement fname = $("#firstname");
    static SelenideElement laname = $("#lastname");
    static SelenideElement company = $("#company");
    static SelenideElement address = $("#address1");
    static SelenideElement city = $("#city");
    static SelenideElement state = $("#id_state");
    static SelenideElement postcode = $("#postcode");
    static SelenideElement contry = $("#id_country");
    static SelenideElement additionalinfo = $("#other");
    static SelenideElement phone = $("#phone");
    static SelenideElement mobile = $("#phone_mobile");
    static SelenideElement alias = $("#alias");
    static SelenideElement submitAccount = $("#submitAccount");

    public void createAccount(String name, String lname, String pass, String addressname, String addresslname) {

        gender.click();
        firstName.sendKeys(name);
        lastName.sendKeys(lname);
        password.sendKeys(pass);
        days.click();
        days.selectOption(4);
        months.selectOption("July ");
        years.click();
        years.selectOption("2013  ");
        newsletter.click();
        checkbox.click();
        fname.sendKeys(addressname);
        laname.sendKeys(addresslname);
        company.setValue("Kaseya");
        address.setValue("701 Brickell Avenue");
        city.setValue("Miami");
        state.selectOption("Florida");
        postcode.setValue("33212");
        contry.selectOption("United States");
        additionalinfo.setValue("Additional information");
        phone.setValue("+" + RandomStringUtils.randomNumeric(12));
        mobile.setValue("+" + RandomStringUtils.randomNumeric(12));
        alias.setValue("18, Baker street");
        submitAccount.click();
    }

}
