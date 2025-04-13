package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamesTest extends BaseTest {

    @Test
    @DisplayName("Открытие карточки игры")
    public void testGameCard() {
        mainPage
                .openPage()
                .clickFirstGameCard();
        gamePage.shouldShowGameDetails();
    }

    @Test
    @DisplayName("Отображение разного количества карточек игр")
    public void testGamesCardsCount() {
        mainPage.openPage();
        for (int i : mainPage.getListOfOptions()) {
            mainPage.selectCardsPerPage(i);
            int visibleCards = mainPage.getVisibleCardsCount();

            assertTrue(visibleCards <= i, "Ошибка: неверное количество карточек.");
        }
    }

    @Test
    @DisplayName("Проверка пагинации")
    public void testPagination() {
        mainPage.openPage();
        mainPage.clickNextPage();
        List<String> nextCards = mainPage.getVisibleCards();
        mainPage.clickPreviousPage();
        List<String> previousCards = mainPage.getVisibleCards();

        assertTrue(!previousCards.equals(nextCards), "Ошибка: карточки не изменились.");
    }
}
