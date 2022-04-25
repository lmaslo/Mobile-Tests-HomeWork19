package tests.sample;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class AndroidSelenideTests {
    @Test
    void searchTest(){

        $(MobileBy.AccessibilityId("Search Wikipedia")).click();
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0));



    }
}
