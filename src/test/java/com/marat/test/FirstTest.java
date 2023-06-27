package com.marat.test;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class FirstTest {

    @Test
    @AllureId("23748")
    @DisplayName("Создание эталонной карточки по шаблону")
    @Tag("Smoke")
    @Owner("allure8")
    @Feature("Создание карточки")
    void searchTest() {
        step("Нажать Создать");
        step("Выбрать категорию");
        step("Нажать Создать");
        step("Заполнить обязательные поля формы");
        step("Нажать Сохранить");
    }
}
