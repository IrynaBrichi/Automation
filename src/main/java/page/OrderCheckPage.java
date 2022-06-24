package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class OrderCheckPage {
    private static SelenideElement mail = $("#email");
    private static SelenideElement pass = $("#passwd");
    private static SelenideElement signInButton = $("#SubmitLogin");
    private static SelenideElement dresses = $x("(//a[@title='Dresses'])[2]");
    private static SelenideElement casualDress = $x("//div[@id='left_column']//h2[contains(text(),'Dresses')]/following-sibling::div//a[contains(text(), 'Casual Dresses')]");
    private static SelenideElement printedDress = $x("//a[@title='Printed Dress' and @class='product-name']");
    private static SelenideElement cart = $x("//a[@title='Add to cart' and @class='button ajax_add_to_cart_button btn btn-default']");
    private static SelenideElement addedToCart = $x("//i[@class='icon-ok']/ancestor::h2");
    private static SelenideElement checkout = $x("//*[@title='Proceed to checkout']");
    private static SelenideElement proceedToCheckout = $x("//a[@title='Proceed to checkout' " +
            "and @class='button btn btn-default standard-checkout button-medium']");
    private static SelenideElement submitCheckout = $x("//*[@type='submit']//span[.='Proceed to checkout']");
    private static SelenideElement checkbox = $(byId("cgv"));
    private static SelenideElement checkbox1 = $x("//*[@name='processCarrier']");
    private static SelenideElement payment = $x("//*[@title='Pay by bank wire']");
    private static SelenideElement confirmation = $x("//button[@class='button btn btn-default button-medium']");
    private static SelenideElement complete = $x("//*[contains(text(), 'Your order on My Store is complete')]");

        public static void OrderCheck(String email, String passwd){
            mail.setValue(email);
            pass.setValue(passwd);
            signInButton.click();
            dresses.click();
            casualDress.click();
            printedDress.hover();
            cart.click();
            checkout.click();
            proceedToCheckout.click();
            submitCheckout.click();
            checkbox.click();
            checkbox1.click();
            payment.click();
            confirmation.click();
        }
}

