package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CustomerServicePage {
    static SelenideElement contactUs = $("#contact-link");
    static SelenideElement customerService = $("#id_contact");
    static SelenideElement orderReference = $(".col-md-3 > div:nth-child(6) > div > select");
    static SelenideElement Product = $("div:nth-child(6) > div > select > option:nth-child(2)");
    static SelenideElement orderIdContactUsField = $("div.selector [name=\"id_order\"");
    static String Order = "select[name=\"id_product\"][id=\"%s_order_products\"]";
    static SelenideElement messageContactUs = $("#message");
    static SelenideElement submitContactUs = $("#submitMessage");

    public static void customerServiceContactUsPage() {
        contactUs.click();
        customerService.sendKeys("Customer service");
        orderReference.click();
        Product.click();
        $(String.format(Order, orderIdContactUsField.getValue())).selectOption(1);
        messageContactUs.sendKeys("I have a problem with my order. Could you help me?");
        submitContactUs.click();
    }
}