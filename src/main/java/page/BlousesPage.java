package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BlousesPage {
    public static SelenideElement womenTab = $x("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    public static SelenideElement blousesTab = $("a[title='Blouses']");
    public static SelenideElement blouseProduct = $(".product_img_link");
    public static SelenideElement moreButton = $x("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span");
    public static SelenideElement addToWishBtn = $("#wishlist_button");
    public static SelenideElement crossBtn = $x("//*[@id=\"product\"]/div[2]/div/div/a");

    public static void blousesPage() {
        womenTab.hover();
        blousesTab.click();
    }

    public static void moreBtn() {
        blouseProduct.hover();
        moreButton.click();
    }

    public static void addToWish() {
        addToWishBtn.click();
        crossBtn.click();
    }


}
