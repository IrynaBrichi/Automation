package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TshirtPage {
    public static SelenideElement tshirt = $x("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    public static SelenideElement fadedShortSleeveT_shirts = $(".product_img_link > img");
    public static SelenideElement moreBtn = $x("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span");
    public static SelenideElement writeReview = $x("//*[@id=\"product_comments_block_extra\"]/ul/li/a");
    public static SelenideElement reviewFiveStars = $x("//*[@title='5']//parent::div");
    public static SelenideElement title = $("#comment_title");
    public static SelenideElement comment = $("#content");
    public static SelenideElement submitReview = $("#submitNewMessage");
    public static SelenideElement okButton = $x("//button[@type='submit' and @value='true']");
    public static SelenideElement commentAddedText = $x("//*[text()='Your comment has been added and will be available once approved by a moderator']");
    public static SelenideElement windowClose = $("#id_new_comment_form");

    public static void selectTshirt() {
        tshirt.click();
    }

    public static void tshirtHoverAndClickMore() {
        fadedShortSleeveT_shirts.hover();
        moreBtn.click();
    }

    public static void writeReviewBtn() {
        //writeReviewField.hover();
        writeReview.click();
    }

    public static void writeReviewText() {
        reviewFiveStars.click();
        title.sendKeys("High quality product");
        comment.sendKeys("Faded short sleeve t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!");
        submitReview.click();
    }

    public static void windowClose() {
        windowClose.should(Condition.disappear);
    }

    public static void okBtn() {
        okButton.click();
    }
}
