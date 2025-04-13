package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final ElementsCollection gameCards = $$x("//*[contains(@class, 'ant-list-items')]");
    private final SelenideElement cardsPerPageDropdown = $x("//*[contains(@class, 'ant-pagination-options')]//*[contains(@class, 'ant-select-selector')]");
    private final ElementsCollection dropdownOptions = $$x("//div[contains(@class, 'ant-select-item-option-content') and contains(text(), '/ page')]");
    private final ElementsCollection gamesCardsList = $$x("//*[contains(@class, 'ant-list-items')]");
    private final SelenideElement previousPage = $x("//*[contains(@class, 'anticon-left')]");
    private final SelenideElement nextPage = $x("//*[contains(@class, 'anticon-right')]");

    public MainPage openPage() {
        open("https://makarovartem.github.io/frontend-avito-tech-test-assignment/");
        return this;
    }

    public void clickFirstGameCard() {
        gameCards.first().shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public void selectCardsPerPage(int count) {
        cardsPerPageDropdown.shouldBe(visible, Duration.ofSeconds(40)).click();
        dropdownOptions.findBy(text(String.valueOf(count))).shouldBe(visible).click();
    }

    public int getVisibleCardsCount() {
        return gamesCardsList.filterBy(visible).size();
    }

    public List<String> getVisibleCards() {
        return gamesCardsList.filterBy(visible).texts();
    }

    public List<Integer> getListOfOptions() {
        return List.of(10, 20, 50, 100);
    }

    public void clickPreviousPage() {
        previousPage.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public void clickNextPage() {
        nextPage.shouldBe(visible, Duration.ofSeconds(30)).click();
    }
}
