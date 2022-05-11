import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.files.DownloadActions.click;


public class HW {
    @Test
    public void orderCheck() {
        open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("i123@gmail.com");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $$(".sf-with-ul").findBy(text("DRESSES")).click();
        $$("#categories_block_left").findBy(text("Casual Dresses")).click();
       $$(".product-container").findBy(text("Printed Dress")).hover();
       $$(".button-container").findBy(text("Add to cart")).click();
       $(".clearfix").should(appear);
       $$(".button-container").findBy(text("Proceed to checkout")).click();
       $$(".btn").findBy(text("Proceed to checkout")).click();
       $$(".btn").findBy(text("Proceed to checkout")).click();
       $("#cgv").click();
       $$(".btn").findBy(text("Proceed to checkout")).click();
       $(".bankwire").click();
       $$(".btn").findBy(text("I confirm my order")).click();
       $(".logout").click();
    }

    @Test
    public void customerService() {
        open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#SubmitCreate").click();
        $("#email_create").sendKeys(RandomStringUtils.randomAlphabetic(4)+"@mail.com");
        $("#SubmitCreate").click();
        $("#id_gender2").click();
        $("#customer_firstname").sendKeys(RandomStringUtils.randomAlphabetic(7));
        $("#customer_lastname").sendKeys(RandomStringUtils.randomAlphabetic(7));
        $("#passwd").sendKeys(RandomStringUtils.randomNumeric(5));
        $("#days").click();
        $("#days").selectOption(4);
        $("#months").selectOption("July ");
        $("#years").click();
        $("#years").selectOption("2013  ");
        sleep(Long.parseLong("2000"));
        $("#uniform-newsletter").click();
        $("#uniform-optin").click();
        $("#firstname").sendKeys(RandomStringUtils.randomAlphabetic(7));
        $("#lastname").sendKeys(RandomStringUtils.randomAlphabetic(7));
        $("#company").sendKeys("Kaseya");
        $("#address1").sendKeys("701 Brickell Avenue");
        $("#city").sendKeys("Miami");
        $("#id_state").selectOption("Florida");
        $("#postcode").sendKeys("33212");
        $("#id_country").selectOption("United States");
        $("#other").sendKeys("Additional information");
        $("#phone").sendKeys("+" + RandomStringUtils.randomNumeric(12));
        $("#phone_mobile").sendKeys("+" + RandomStringUtils.randomNumeric(12));
        $("#alias").sendKeys("18, Baker street");
        $("#submitAccount").click();
        $$(".sf-with-ul").findBy(text("DRESSES")).click();
        $$("#categories_block_left").findBy(text("Casual Dresses")).click();
        $$(".product-container").findBy(text("Printed Dress")).hover();
        $$(".button-container").findBy(text("Add to cart")).click();
        $(".clearfix").should(appear);
        $$(".button-container").findBy(text("Proceed to checkout")).click();
        $$(".btn").findBy(text("Proceed to checkout")).click();
        $$(".btn").findBy(text("Proceed to checkout")).click();
        $("#cgv").click();
        $$(".btn").findBy(text("Proceed to checkout")).click();
        $(".bankwire").click();
        $$(".btn").findBy(text("I confirm my order")).click();
        $(".logout").click();
        $("#contact-link").click();
        $("#id_contact").selectOption("Customer service");
        $("#desc_contact2").should(appear);
        $(".selector").selectOptionByValue("Printed Dress");
        $("#433539_order_products").selectOptionByValue("Printed Dress");
        $("#message").sendKeys("I have a problem with my order. Could you help me?");
        $("#submitMessage").click();



    }
}
