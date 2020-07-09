package ru.idtm.filters;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Filters {

    public static void filter(String typTask) {

        $("#taskTypes").click();
        if (!($(byText(typTask)).is(Condition.visible))) {
            $("#taskTypes").setValue(typTask);
        }
        $(byText(typTask)).click();
        sleep(10000);
    }
    public static void type(String typDoc) {
        $$("#docTypes")
                .last()
                .setValue(typDoc);
        $(byText((typDoc))).click();
    }




}
