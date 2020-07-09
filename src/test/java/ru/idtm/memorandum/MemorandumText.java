package ru.idtm.memorandum;

import org.junit.Test;
import ru.idtm.buttons.Buttons;
import ru.idtm.content.Content;
import ru.idtm.fields.Fields;
import ru.idtm.filter.FilterTest;
import ru.idtm.open.OpenBrowser;
import ru.idtm.requiredfields.RequiredFields;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.url;
import static ru.idtm.filter.FilterTest.*;

public class MemorandumText {

    private static final String BUTTON = "Выбрать";
    private static final String PATH = "html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog.user-list-dialogue-wrapper div.el-dialog__footer span.dialog-footer button.primary.default-margin-right.btn-def.fs-12";
    private static final String CONTENT = "Контент";
    private final String INPUTDOCUMENT = "ВХОДЯЩИЕ ДОКУМЕНТЫ";
    private final String OUTPUTDOCUMENT = "ИСХОДЯЩИЕ ДОКУМЕНТЫ";
    private final String OUTPUTDOCUMENT1 = "Исходящие документы";
    private static final String INTERNAL_DOCUMENTS = "ВНУТРЕННИЕ ДОКУМЕНТЫ";
    private final String ERRAND = "ИНИЦИАТИВНОЕ ПОРУЧЕНИЕ";
    private final String ERRAND1 = "ИНИЦИАТИВНЫЕ ПОРУЧЕНИЯ";
    private final String MEMORANDUM_TEST = "C3(тест)";
    private static final String MEMORANDUM_TEXT = "Служебная записка";
    private final String BOSS = "Босс11";
    private final String INPUT_DOC = "Входящий документ.docx";
    private final String OUTPUT_DOC = "Договор поставки.doc";
    private static final String ORDER_DOC = "Приказ об изменении орг-штатной структуры.docx";
    private static final String MEMORANDUM_DOC = "СЗ.txt";
    private final String ERRAND_DOC = "Распоряжение_.gif";
    private final String PROXY_DOC = "Доверенность на курьера.png";
    private final String ANSWER = "ответ.txt";
    private static final String REGULATORY_DOCUMENTS = "РАСПОРЯДИТЕЛЬНЫЕ ДОКУМЕНТЫ";
    private static final String ORDER_DOCUMENTS = "Приказ (пустая форма)";
    private static final String ORDER_DOCUMENTS1 = "Приказ (общий)";
    private static final String ORDER = "Приказ";
    private static String registrationNumber;
    private static String identifier;
    private static String temporaryNumber;
    private static String description;
    private static String singer;
    private static String organization;
    private static String department;
    private static final String AUTOTEST1 = "Автотест1 , Сотрудник, Департамент 1";
    private static final String DEPARTMENT1 = "Департамент 1";
    private static final String DEPARTMENT2 = "Департамент 2";
    private static final String DEPARTMENT3 = "Департамент 3";
    private static final String DEPARTMENT4 = "Департамент 4";
    private static final String DEPARTMENT5 = "Департамент 5";
    private static final String AUTOTEST_NAME1 = "Автотест1";
    private static final String AUTOTEST2 = "Автотест2 , Сотрудник, Департамент 2";
    private static final String AUTOTEST_NAME2 = "Автотест2";
    private static final String AUTOTEST3 = "Автотест3 , Сотрудник, Департамент 3";
    private static final String AUTOTEST_NAME3 = "Автотест3";
    private static final String AUTOTEST4 = "Автотест4 , Сотрудник, Департамент 4";
    private static final String AUTOTEST_NAME4 = "Автотест4";
    private static final String AUTOTEST5 = "Автотест5 , Сотрудник, Департамент 5";
    private static final String AUTOTEST_NAME5 = "Автотест5";
    private static final String AUTOTEST_ROSSET_NAME1 = "Автотест1, зам. начальника отдела, Тестовый отдел";
    private static final String AUTOTEST_ROSSET_NAME2 = "Автотест2, зам. начальника отдела, Тестовый отдел";
    private static final String AUTOTEST_ROSSET_NAME3 = "Автотест3, зам. начальника отдела, Тестовый отдел";
    private static final String AUTOTEST_ROSSET_NAME4 = "Автотест4, зам. начальника отдела, Тестовый отдел";
    private static final String AUTOTEST_ROSSET_NAME5 = "Автотест5, зам. начальника отдела, Тестовый отдел";
    private static final String AUTOTEST_ROSSET_ORGAN_NAME1 = "Автотест1 А. Т.,ПАО \"Кубаньэнерго\",Сотрудник1";
    private static final String AUTOTEST_ROSSET_ORGAN_NAME2 = "Автотест2 А. Т.,ПАО \"Кубаньэнерго\",Сотрудник2";
    private static final String AUTOTEST_ROSSET_ORGAN_NAME3 = "Автотест3 А. Т.,ПАО \"Кубаньэнерго\",Сотрудник3";
    private static final String AUTOTEST_ROSSET_ORGAN_NAME4 = "Автотест4 А. Т.,ПАО \"Кубаньэнерго\",Сотрудник4";
    private static final String AUTOTEST_ROSSET_ORGAN_NAME5 = "Автотест5 А. Т.,ПАО \"Кубаньэнерго\",Сотрудник5";
    private static final String AUTOTEST1_TNT = "Автотест1 А. Т.,ООО \"Айди-Технологии управления\",Сотрудник1";
    private static final String AUTOTEST2_TNT = "Автотест2 А. Т.,ООО \"Айди-Технологии управления\",Сотрудник2";
    private static final String AUTOTEST3_TNT = "Автотест3 А. Т.,ООО \"Айди-Технологии управления\",Сотрудник3";
    private static final String AUTOTEST4_TNT = "Автотест4 А. Т.,ООО \"Айди-Технологии управления\",Сотрудник4";
    private static final String AUTOTEST5_TNT = "Автотест5 А. Т.,ООО \"Айди-Технологии управления\",Сотрудник5";
    private static final String AUTOTEST1_TNT_EMPLOER = "Автотест1 , Зам. начальник отдела, ООО \"Айди-Технологии управления\"";
    private static final String AUTOTEST2_TNT_EMPLOER = "Автотест2 , Зам. начальник отдела, ООО \"Айди-Технологии управления\"";
    private static final String AUTOTEST3_TNT_EMPLOER = "Автотест3 , Зам. начальник отдела, ООО \"Айди-Технологии управления\"";
    private static final String AUTOTEST4_TNT_EMPLOER = "Автотест4 , Зам. начальник отдела, ООО \"Айди-Технологии управления\"";
    private static final String AUTOTEST5_TNT_EMPLOER = "Автотест5 , Зам. начальник отдела, ООО \"Айди-Технологии управления\"";
    private static String corentUrl;


    public static void createMemorandum() {

//        CreateDocument.createInDoc(INTERNAL_DOCUMENTS,MEMORANDUM_TEXT);
        $(byText("Создать документ")).click();
        $(byText(INTERNAL_DOCUMENTS)).click();
        sleep(1000);
        $(byText(MEMORANDUM_TEXT)).click();
        $(byText("Создать")).click();
        corentUrl = url();

        // реквизиты
        Buttons.requisites();


        //
        $$(byXpath("//*[@id=\"dsid_stamp\"]"))
                .first()
                .click();
        $(byText("Общего пользования")).click();


        // описание
        RequiredFields.description("Служебка");
        description = $(byXpath("//*[@id=\"dss_description\"]")).getValue();

        if ($("#dsid_document_kind").is(empty)) {
            $("#dsid_document_kind").setValue("Указание");
            $(byText("Указание")).click();
        }


        // адресат
        if (corentUrl.equals(OpenBrowser.gettNt())) {
            RequiredFields.addressee(AUTOTEST_NAME1, AUTOTEST1_TNT_EMPLOER);
        } else {

            RequiredFields.addressee(AUTOTEST_NAME1, DEPARTMENT1, AUTOTEST1, AUTOTEST_ROSSET_NAME1);
        }

        $(byText(CONTENT)).click();
        Content.contentUpload(MEMORANDUM_DOC);
        sleep(1000);
        Buttons.save();


        // подписант
        if (corentUrl.equals(OpenBrowser.gettNt())) {
            Fields.singer(AUTOTEST_NAME1, AUTOTEST1_TNT_EMPLOER);
        } else {

            Fields.singer(AUTOTEST_NAME1, DEPARTMENT1, AUTOTEST1, AUTOTEST_ROSSET_ORGAN_NAME1, AUTOTEST_ROSSET_NAME1);
        }

        Buttons.save();
        sleep(1000);
        Buttons.content();
        sleep(1000);
        Buttons.requisites();
        registrationNumber = $(byXpath("//*[@id=\"dss_reg_number\"]")).getValue();
        sleep(10000);


        // на согласование
        $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div[1]/div[2]/ul/li[1]/button")).click();
        sleep(10000);


    }
}
