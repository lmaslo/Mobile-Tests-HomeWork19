package tests.sample.emulator;

import com.codeborne.selenide.Selenide;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

@Tag("selenide")
public class AndroidSelenideTestsNewApp extends TestBase {


    //onboasrding
    @Test
    void searchTest3() {
        //Онбординг первый шаг

        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("We’ve found the following on your device:"));

        //второй шаг онбординга
        $(AppiumBy.xpath("//android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
        $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("Dive down the Wikipedia rabbit hole with " +
                "a constantly updating Explore feed. Customize the feed to your interests – whether it’s learning about historical " +
                "events On this day, or rolling the dice with Random."));


        //третий шаг онбординга
        $(AppiumBy.xpath("//android.widget.LinearLayout/android.widget.LinearLayout[3]")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists with sync"));
        $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("You can make reading lists from " +
                "articles you want to read later, even when you’re offline. Login to your Wikipedia account to sync your " +
                "reading lists. Join Wikipedia"));


        //четвертый
        $(AppiumBy.xpath("//android.widget.LinearLayout/android.widget.LinearLayout[4]")).click();
       $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Send anonymous data"));
        $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("Help make the app better" +
                " by letting us know how you use it. Data collected is anonymous. Learn more"));


    }




    @Test
    void searchTest() {
        step("Skip onboarding", Selenide::back);
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                    .setValue("Appium");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    void searchTest1() {
        //проверка текста под картонкой под поиском
        step("Skip onboarding", Selenide::back);
        $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text"))
                .shouldHave(text("Customize your Explore feed You can now choose what to show on your feed, and also prioritize your favorite types of content."));

    }


    @Test
    void searchTest2() {
        //проверка заголовка на экране настроить ленту
        step("Skip onboarding", Selenide::back);
        $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_action_positive")).click();
        $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
                + "/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Customize the feed"));


    }


    //Проверка элементов в таб баре и переход по их вкладкам
    //Дописать проверку текстов
    @Test
    void searchTest11() {
        //проверка текста под картонкой под поиском
        step("Skip onboarding", Selenide::back);


        $(AppiumBy.accessibilityId("Saved")).click();
       /* $(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Saved\"]/android.widget.FrameLayout/android.widget.ImageView"))
                .click();*/


        /*$(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Saved"));*/


        $(AppiumBy.accessibilityId("Search")).click();
       /* $(AppiumBy.id("org.wikipedia.alpha:id/history_title")).shouldHave(text("History"));*/




        $(AppiumBy.accessibilityId("Edits")).click();
       /* $(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Edits\"]/android.widget.FrameLayout/android.widget.ImageView"))
                .click();
        $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"))
                .shouldHave(text("Saved"));*/


        $(AppiumBy.accessibilityId("More")).click();


    }


}
