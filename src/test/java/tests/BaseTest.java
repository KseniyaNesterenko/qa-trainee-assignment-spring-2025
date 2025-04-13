package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import pages.GamePage;
import pages.MainPage;

public class BaseTest {
    protected MainPage mainPage;
    protected GamePage gamePage;

    @BeforeEach
    void setup() {
        if (System.getenv("CI") != null) {
            Configuration.headless = true;
        }

        mainPage = new MainPage();
        gamePage = new GamePage();
    }
}
