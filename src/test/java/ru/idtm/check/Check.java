package ru.idtm.check;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Check {

    public static void check(String nameSearch, String nameCheck) {

        if (nameSearch.equals("Согласование")) {
            $(byText("СЭДО")).click();
        }else {
            $$(byText(nameSearch)).first().click();
        }
        sleep(10000);


        if ($(byText("Согласование и подписание")).isDisplayed()) {
            $(byText("Согласование и подписание")).click();
        } else {
            $(byText("Адресаты")).click();
        }

        if ($(".user-info-container > div:nth-child(1)").shouldHave(text(nameCheck)).is(Condition.visible)) {
            $(".user-info-container > div:nth-child(1)").shouldHave(text(nameCheck));
        } else if ($(".sortable-chosen > div:nth-child(2) > div:nth-child(1)").is(visible)) {
            $(".sortable-chosen > div:nth-child(2) > div:nth-child(1)").shouldHave(text(nameCheck));
        } else {
            $(byText(nameCheck)).shouldBe(Condition.visible);
        }

    }

}
