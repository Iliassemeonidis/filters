package ru.idtm.search;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Search {
    private static boolean visible;

    public static void searchWithButtonSearch(String typs) {

        $("button.el-tooltip:nth-child(1)").click();
        sleep(1000);
        visible = $("#types").is(Condition.visible);
        if (!visible) {
            $(byText("По документам")).click();
        }
        $("#types").click();
        visible = $(byText(typs)).is(Condition.visible);
        if (!visible) {
            visible = $("#types").is(Condition.visible);
            if (!visible) {
                $(byText("По документам")).click();
            }
            $("#types").setValue(typs);
        }
        $(byText(typs)).click();


    }

    public static void searchWithButtonDocument(String typs) {
        $(byText("По документам")).click();
        sleep(1000);
        visible = $("#types").is(Condition.visible);
        if (!visible) {
            $(byText("По документам")).click();
        }
        $("#types").click();
        visible = $(byText(typs)).is(Condition.visible);
        if (!visible) {
            $("#types").setValue(typs);
        }
        $(byText(typs)).click();
    }
}
