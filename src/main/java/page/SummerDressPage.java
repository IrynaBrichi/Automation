package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SummerDressPage {
    static SelenideElement selectorPrintedSummerDresses = $$("img[alt='Printed Summer Dress']").get(0);
    static SelenideElement MoreBtn = $$("a.button.lnk_view.btn.btn-default").get(0);
    static SelenideElement blackColor = $("a[title='Black']");
    static SelenideElement orangeColor = $("a[title='Orange']");
    static SelenideElement blueColor = $("a[title='Blue']");
    static SelenideElement yellowColor = $("a[title='Yellow']");

    public static void selectPrintedSummerDressesWithFourColor() {
        selectorPrintedSummerDresses.hover();
        MoreBtn.click();
    }

    public static void selectBlackColor() {
        blackColor.click();
    }

    public static void selectOrangeColor() {
        orangeColor.click();
    }

    public static void selectBlueColor() {
        blueColor.click();
    }

    public static void selectYellowColor() {
        yellowColor.click();
    }
}
