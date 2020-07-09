package ru.idtm.inputdoc;

import com.codeborne.selenide.Condition;
import ru.idtm.buttons.Buttons;
import ru.idtm.content.Content;
import ru.idtm.createdoc.CreateDocument;
import ru.idtm.open.OpenBrowser;
import ru.idtm.requiredfields.RequiredFields;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class InputDocument {
    private static final String BUTTON = "Выбрать";
    private static final String PATH = "html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog.user-list-dialogue-wrapper div.el-dialog__footer span.dialog-footer button.primary.default-margin-right.btn-def.fs-12";
    private static final String CONTENT = "Контент";
    private static final String INPUTDOCUMENT = "ВХОДЯЩИЕ ДОКУМЕНТЫ";
    private static final String INPUT_DOC = "Входящий документ.docx";
    private static final String AUTOTEST1 = "Автотест1 , Сотрудник, Департамент 1";
    private static final String DEPARTMENT1 = "Департамент 1";
    private static final String AUTOTEST_NAME1 = "Автотест1";
    private static final String AUTOTEST_NAME3 = "Автотест3";
    private static final String AUTOTEST1_TNT = "Автотест1 А. Т.,ООО \"Айди-Технологии управления\",Сотрудник1";
    private static final String AUTOTEST3_TNT = "Автотест3 А. Т.,ООО \"Айди-Технологии управления\",Сотрудник3";
    private static final String AUTOTEST1_TNT_EMPLOER = "Автотест1 , Зам. начальник отдела, ООО \"Айди-Технологии управления\"";
    private static String corentUrl;

    public static void createDoc() {
        CreateDocument.create(INPUTDOCUMENT);
        corentUrl = url();

        //Проверка на дубли
        Random rd = new Random();

        System.out.println(corentUrl);
        if (OpenBrowser.gettNt().equals(corentUrl)) {
            $("#dsid_agent_person").setValue(AUTOTEST_NAME3);
            sleep(1000);
            $(byText(AUTOTEST3_TNT)).click();
        }/// сделать тоже самое для всех площадок такой же ифчик
        else {
            $(".layout-icon").click();
            $("html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog.user-list-dialogue-wrapper div.el-dialog__body div.user-select-dialogue-container div.user-selected-user-list-container div.tabs-wrapper div.column-container.tab-content-wrapper div.user-select-dialogue-wrapper div.table-container div.list-table.bg-color-white div.flex.flex-column.full-flex-sizes.p-r-16.table-header-container div.flex.ai-center.m-b-8 div.m-r-8.w-100.flex div.filter-container div.flex.full-with.filter-field.p-b-0 input#fio.base-input.full-with.fs-12").setValue(AUTOTEST_NAME3);
            sleep(1000);
            if ($(byText("Сотрудник 3")).is(visible)) {

                $$(byText("Сотрудник 3")).first().click();
            } else {
                $(byText("Сотрудник3")).click();
            }
            $$(PATH).findBy(text(BUTTON)).click();
        }
        $(byXpath("//*[@id=\"dss_crsp_reg_number\"]")).setValue(String.valueOf(rd.nextInt(201) + 10));
        $(byXpath("//*[@id=\"dsdt_crsp_reg_date\"]")).click();
        boolean visible = $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div/div[2]/div[12]")).isDisplayed();
        if (visible) {
            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div/div[2]/div[12]")).click();
        } else {
            $(byText("5")).click();
        }


        //Жмем кнопку далее
        $(byText("Далее")).click();
        sleep(10000);


        // заполняем обязательные поля
        Buttons.requisites();
        RequiredFields.description("Auto-test");
        if (corentUrl.equals(OpenBrowser.gettNt())) {
            RequiredFields.addressee(AUTOTEST_NAME1, AUTOTEST1_TNT_EMPLOER);
        } else {
            RequiredFields.addressee(AUTOTEST_NAME1, DEPARTMENT1, AUTOTEST1, "Автотест1 , Зам. начальник отдела, ООО \"Айди-Технологии управления\"");
        }
        if ($("#dsid_document_kind").is(Condition.visible)) {

            $("#dsid_document_kind").setValue("Вход");
            sleep(1000);
            $(byText("Входящие документы")).click();
        }


        // контент загружаем
        $(byText(CONTENT)).click();
        Content.contentUpload(INPUT_DOC);
        sleep(1000);


        //Жмем кнопку зарегистрировать
        sleep(1000);
        Buttons.save();
        //$(byText("Зарегистрировать")).click();
        sleep(1000);


        //Жмем кнопку зарегистрировать
//        Buttons.register();
        sleep(1000);
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/ul/li[1]/button")).click();
        //$(byText("Зарегистрировать")).click();
        sleep(1000);


        // На Рассмотрение
        sleep(10000);
        if ($(".\\#ffd700").isDisplayed()) {
            $(".\\#ffd700").click();
        } else if ($(byText("На Рассмотрение")).isDisplayed()) {
            Buttons.review();
        } else if ($(byXpath("//button[@class='action-button full-flex-sizes #ffd700']")).isDisplayed()) {
            $(byXpath("//button[@class='action-button full-flex-sizes #ffd700']")).click();
        }

sleep(10000);


    }
}
