# QA-trainee-assignment-spring-2025

## Описание

Проект состоит из двух заданий:

1. **Задание 1** — [task1.md](task1.md).
2. **Задание 2.2** — автоматизированные тесты для игровой платформы.

Платформа доступна по следующему адресу:  
[https://makarovartem.github.io/frontend-avito-tech-test-assignment/](https://makarovartem.github.io/frontend-avito-tech-test-assignment/)

### Пользовательские сценарии, покрытые тестами:

- Открытие карточки игры.
- Отображение разного количества карточек игр на странице.
- Переход по страницам результата поиска с помощью пагинации.

## Технологии

- **Java 17+**
- **Maven**
- **JUnit 5**
- **Selenide** 

## CI/CD

Проект настроен на автоматический запуск тестов.

## Запуск тестов локально

```bash
mvn clean test
