package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage {

public static SelenideElement myAccount = $(".account");
public static SelenideElement myWishList = $(".icon-heart");
public static SelenideElement firstWish = $("td:nth-child(1) > a");
public static SelenideElement deleteWish = $(".wishlist_delete > a");
public static SelenideElement blockMyWishList =$("#block-history > table");

public static void myAccountOpen() {
    myAccount.click();
}
public static void myWishListOpen() {
    myWishList.click();
}
public static void myFirstWishClick() {
    firstWish.click();
}
public static void deleteMyWish() {
    deleteWish.click();
    Selenide.switchTo().alert().accept();
    blockMyWishList.should(Condition.disappear);
}
}
