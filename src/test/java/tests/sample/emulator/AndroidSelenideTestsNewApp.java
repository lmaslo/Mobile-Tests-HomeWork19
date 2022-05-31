package tests.sample.emulator;

import com.codeborne.selenide.Selenide;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

/*@Tag("selenide")
public class AndroidSelenideTestsNewApp extends TestBase {


    @Test
    @DisplayName("Проверка онбординга")
    @Description("Проверка перехода между экранами онбординга и текстов на экранах ")
    void onboardingTest() {

        step("Check the onboarding first screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("The Free Encyclopedia …in over 300 languages"));
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("We’ve found the following on your device:"));
        });

        step("Moving to the second screen", () -> {
            $(AppiumBy.xpath("//android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
        });

        step("Check the onboarding second screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("Dive down the Wikipedia rabbit hole with " +
                    "a constantly updating Explore feed. Customize the feed to your interests – whether it’s learning about historical " +
                    "events On this day, or rolling the dice with Random."));
        });

        step("Moving to the third screen", () -> {
            $(AppiumBy.xpath("//android.widget.LinearLayout/android.widget.LinearLayout[3]")).click();
        });

        step("Check the onboarding third screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists with sync"));
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("You can make reading lists from " +
                    "articles you want to read later, even when you’re offline. Login to your Wikipedia account to sync your " +
                    "reading lists. Join Wikipedia"));
        });

        step("Moving to the fourth screen", () -> {
            $(AppiumBy.xpath("//android.widget.LinearLayout/android.widget.LinearLayout[4]")).click();
        });

        step("Check the onboarding fourth screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Send anonymous data"));
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("Help make the app better" +
                    " by letting us know how you use it. Data collected is anonymous. Learn more"));
        });

    }


    @Test
    @DisplayName("Проверка поиска")
    @Description("Проверка поиска по тексту Appium ")
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
    @DisplayName("Проверка экрана Настроить ленту'")
    @Description("Проверка открытия экрана Настроить ленту и текста на нем")
    void searchScreenTape() {

        step("Skip onboarding", Selenide::back);

        step("Moving to screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_action_positive")).click();
        });

        step("Check text", () -> {
            $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
                    + "/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"))
                    .shouldHave(text("Customize the feed"));
        });
    }


    @Test
    @DisplayName("Проверка экрана перехода через tabbar'")
    @Description("Проверка перехода по таббару и текста на экранах ")
    void checkTabbar() {
        step("Skip onboarding", Selenide::back);

        step("Moving to the Saved screen from tab bar", () -> {
            $(AppiumBy.accessibilityId("Saved")).click();
        });

        step("Check text on screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/messageTitleView"))
                    .shouldHave(text("Sync reading lists"));
        });

        step("Moving to the Search screen from tab bar", () -> {
            $(AppiumBy.accessibilityId("Search")).click();
        });

        step("Check text on screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/history_title")).shouldHave(text("History"));
        });

        step("Moving to the Edits screen from tab bar", () -> {
            $(AppiumBy.accessibilityId("Edits")).click();
        });

        step("Check text on screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/messageTitleView")).shouldHave(text("Did you " +
                    "know that everyone can edit Wikipedia?"));
        });

        step("Moving to the More screen from tab bar", () -> {
            $(AppiumBy.accessibilityId("More")).click();
        });

        step("Check text on screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/main_drawer_account_container")).shouldHave(visible);
        });

    }


}*/
