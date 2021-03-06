package ru.idtm.workwithdocuments;

import com.codeborne.selenide.Condition;
import ru.idtm.buttons.Buttons;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class WorkWithDocuments {

    public static void tryToFindDocWithDescription(String description) {
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"desc\"]")).setValue(description);
        sleep(10000);
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
        sleep(1000);
        $$(byText("Распорядительные документы"))
                .first()
                .click();

    }

    public static void tryToFindDocWithRegNumber(String regNumber) {
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"desc\"]")).setValue(regNumber);
        sleep(10000);
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
        sleep(1000);
        $$(byText("Распорядительные документы"))
                .first()
                .click();

    }


    public static void tryToFindDocWithSinger(String singer) {
        // ием по подписанту
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"desc\"]")).setValue(singer);
        sleep(10000);
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
        sleep(1000);
        $$(byText("Распорядительные документы"))
                .first()
                .click();
    }


    public static void tryToFindDoc(String text) {
        // ием по подписанту
        boolean visible = $(byText("Все задания")).isDisplayed();
        if (!visible) {
            $(byText("Мои задания")).click();
        }
        $(byText("Все задания")).click();
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"desc\"]")).setValue(text);
        sleep(10000);
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
        sleep(1000);
        $$(byText(text))
                .first()
                .click();

    }

    public static void tryToFindDoc(String text, String description) {
        // ием по подписанту
        boolean visible = $(byText("Все задания")).isDisplayed();
        if (!visible) {
            $(byText("Мои задания")).click();
        }
        $(byText("Все задания")).click();
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/button")).click();
        $(byXpath("//*[@id=\"desc\"]")).setValue(text);
        sleep(10000);
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[4]/div[2]/button")).click();
        sleep(1000);
        $$(byText(description))
                .first()
                .click();

    }

    public static void visibleElementMyTasks(String element) {
        boolean visible = $(byText(element)).isDisplayed();

        if (!visible) {
            $(byText("Мои задания")).click();
        }
    }

    public static void visibleElementWithText(String element, String text) {
        boolean visible = $(byText(element)).is(Condition.visible);

        if (!visible) {
            $(byText(text)).click();
        } else $(byText(element)).click();
    }

    public static void visibleElementWithXpath(String element, String text) {
        boolean visible = $(byXpath(element)).is(Condition.visible);

        if (!visible) {
            $(byXpath(text)).click();
        } else $(byXpath(element)).click();
    }

    public static void visibleElementWithXpathAndCss(String element, String text) {
        boolean visible = $(byXpath(element)).is(Condition.visible);
        if (visible) {
            $(byXpath(text)).click();

        } else $(element).click();
    }
    public static void visibleElementWithTextAnd2Css(String text, String css, String val, String scc) {
        boolean visible = $(byText(text)).is(Condition.visible);
        if (visible) {
            $(css).setValue(val);
        } else {
            $(scc).scrollIntoView(true);
            $(scc).setValue(val);
        }
        Buttons.search();

    }


}
