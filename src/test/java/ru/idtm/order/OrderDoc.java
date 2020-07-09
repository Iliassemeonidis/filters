package ru.idtm.order;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import ru.idtm.buttons.Buttons;
import ru.idtm.content.Content;
import ru.idtm.fields.Fields;
import ru.idtm.requiredfields.RequiredFields;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;


public class OrderDoc {

    private static final String BUTTON = "Выбрать";
    private static final String PATH = "html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog.user-list-dialogue-wrapper div.el-dialog__footer span.dialog-footer button.primary.default-margin-right.btn-def.fs-12";
    private final String CONTENT = "Контент";
    private final String INPUTDOCUMENT = "ВХОДЯЩИЕ ДОКУМЕНТЫ";
    private final String OUTPUTDOCUMENT = "ИСХОДЯЩИЕ ДОКУМЕНТЫ";
    private final String OUTPUTDOCUMENT1 = "Исходящие документы";
    private final String INTERNAL_DOCUMENTS = "ВНУТРЕННИЕ ДОКУМЕНТЫ";
    private final String ERRAND = "ИНИЦИАТИВНОЕ ПОРУЧЕНИЕ";
    private final String ERRAND1 = "ИНИЦИАТИВНЫЕ ПОРУЧЕНИЯ";
    private final String MEMORANDUM_TEST = "C3(тест)";
    private final String MEMORANDUM_TEXT = "Служебная записка";
    private final String BOSS = "Босс11";
    private final String INPUT_DOC = "Входящий документ.docx";
    private final String OUTPUT_DOC = "Договор поставки.doc";
    private static final String ORDER_DOC = "Приказ об изменении орг-штатной структуры.docx";
    private final String MEMORANDUM_DOC = "СЗ.txt";
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

    public static void createOrder() {
        $(byText("Создать документ")).click();

        $(byText(REGULATORY_DOCUMENTS)).click();

        if (($(byText(ORDER_DOCUMENTS)).is(Condition.visible))) {
            $(byText(ORDER_DOCUMENTS)).click();
        } else if ($(byText(ORDER_DOCUMENTS1)).is(Condition.visible)) {
            $(byText(ORDER_DOCUMENTS1)).click();
        } else if ($(byText(ORDER)).is(Condition.visible)) {
            $(byText(ORDER)).click();
        }

        $(byText("Создать")).click();
        // создаем приказ
        Buttons.requisites();

        //////заполняем обязательные поле описание
        RequiredFields.description("Auto-test777");

// заполняем поле подписант
        Fields.singer(AUTOTEST_NAME1, DEPARTMENT1, AUTOTEST1, AUTOTEST_ROSSET_NAME1, AUTOTEST_ROSSET_ORGAN_NAME1);


        // переходим в контент

        Buttons.content();


        //
//    // загружаем док

        Content.contentUpload(ORDER_DOC);
        sleep(1000);


        //
//    // сохранякм и ждем

        Buttons.save();
        sleep(10000);
        if ($("#dsid_themes").is(Condition.visible)) {

            if ($("#dsid_themes").is(empty)) {
                $("#dsid_themes").setValue("Бизнес-процесс");
                $(byText("Бизнес-процесс")).click();
            }
        }
        sleep(1000);
        Buttons.save();


        Buttons.requisites();
        sleep(1000);


        // получаем рег набр
        registrationNumber = $(byXpath("//*[@id=\"dss_reg_number\"]")).getValue();
        System.out.println(registrationNumber);


        // получаем временный номер
        temporaryNumber = $(byXpath("//*[@id=\"dss_work_number\"]")).getValue();
        System.out.println(temporaryNumber);


        // получаем краткое описание
        description = $(byXpath("//*[@id=\"dss_description\"]")).getValue();
        System.out.println(description);


        // получаем подписанта
        singer = $(byXpath("//*[@id=\"dsid_signer_empl\"]")).getValue();
        System.out.println(singer);


        // нажимаем на вкладку соласование и подписание
        $(byText("Согласование и подписание")).click();
        sleep(10000);
        $(byXpath("//input[@id='completeCondition']")).click();
        $(byText("Ждать первой визы")).click();


        // заполняем этапы  проверка оформления

        // добавляем проверка оформления
        boolean visible = $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[5]/div[3]/div[2]/div/div[1]/div[3]/button[1]")).isDisplayed();
        if (visible) {
            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[5]/div[3]/div[2]/div/div[1]/div[3]/button[1]")).click();
        } else {
            ElementsCollection el = $$(byText("Добавить этап"));
            el.get(0).click();
        }


        $(".layout-icon").click();
        if (!($(byXpath("//*[@id=\"branchId\"]")).has(text("Тестовый Филиал"))) || !($(byXpath("//*[@id=\"branchId\"]")).has(text("Тестовый филиал")))) {

            $(byXpath("//*[@id=\"branchId\"]")).setValue("Тестовый Филиал");
            sleep(1000);
            if ($(byText("Тестовый филиал")).is(Condition.visible)) {

                $(byText("Тестовый филиал")).click();
            } else {
                if ($(byText("Тестовый Филиал")).is(Condition.visible)) {

                    $(byText("Тестовый Филиал")).click();
                } else {
                    $(byXpath("//*[@id=\"branchId\"]")).pressEnter();
                }
            }
        }
        sleep(1000);
        $(byXpath("//*[@id=\"query\"]")).setValue(AUTOTEST_NAME1).pressEnter();
        sleep(10000);
        if ($(byText(DEPARTMENT1)).is(Condition.visible)) {

            $(byText(DEPARTMENT1)).click();
        } else if ($(byText("Тестовый отдел")).is(Condition.visible)){
                $(byText("Тестовый отдел")).click();
            } else if ($(byText(AUTOTEST_NAME1)).is(Condition.visible)){
                $(byText(AUTOTEST_NAME1)).click();
            }

        $$(PATH).findBy(text(BUTTON)).click();

        if (!($(byText("Добавить")).isDisplayed())) {
            $$(byText("Сохранить")).shouldHaveSize(7)
                    .get(6)
                    .click();
        } else $(byText("Добавить")).click();
        sleep(1000);


        // добавдяем этап
        if (!($(byText("Добавить этап")).isDisplayed())) {
            ElementsCollection el = $$(byText("Добавить этап"));
            el.get(0).click();
        } else {
            $(byText("Добавить этап")).click();
        }

        if ($(byXpath("//*[@id=\"term\"]")).is(Condition.visible)) {

            $(byXpath("//*[@id=\"term\"]")).setValue("3");
        }


        //
//    //    // заполняем согласующего

        // согласующий
        Fields.agreement(AUTOTEST_NAME1, DEPARTMENT1, AUTOTEST1);


        // нажимаем кнопку на согласование

        // согласовать
        sleep(10000);
        $(byXpath("//button[@class='action-button full-flex-sizes #ffd700']")).click();
        sleep(1000);

    }
}
