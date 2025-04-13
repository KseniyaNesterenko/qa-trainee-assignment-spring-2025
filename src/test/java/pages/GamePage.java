package pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class GamePage {
    private final SelenideElement gameDescription = $x("//*[contains(@class, 'ant-description')]");

    public void shouldShowGameDetails() {
        gameDescription.shouldBe(visible, Duration.ofSeconds(30));
    }
}
