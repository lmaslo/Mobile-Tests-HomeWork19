package tests.sample;

import com.codeborne.selenide.Configuration;
import helpers.BrowserstackMobileDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;


public class TestBase {

    @BeforeAll
    public static void setup(){
        Configuration.browser = BrowserstackMobileDriver.class.getName();
        Configuration.startMaximized = false;

    }

    @BeforeEach
    public void startDriver() {
        open();
    }
}
