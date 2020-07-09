package ru.idtm.output;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;
import ru.idtm.buttons.Buttons;
import ru.idtm.content.Content;
import ru.idtm.createdoc.CreateDocument;
import ru.idtm.fields.Fields;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;

public class OutputDocument {

    private static final String BUTTON = "Выбрать";
    private static final String PATH = "html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog.user-list-dialogue-wrapper div.el-dialog__footer span.dialog-footer button.primary.default-margin-right.btn-def.fs-12";
    private static final String CONTENT = "Контент";
    private static final String INPUTDOCUMENT = "ВХОДЯЩИЕ ДОКУМЕНТЫ";
    private static final String OUTPUTDOCUMENT = "ИСХОДЯЩИЕ ДОКУМЕНТЫ";
    private static final String OUTPUTDOCUMENT1 = "Исходящие документы";
    private static final String INTERNAL_DOCUMENTS = "ВНУТРЕННИЕ ДОКУМЕНТЫ";
    private static final String ERRAND = "ИНИЦИАТИВНОЕ ПОРУЧЕНИЕ";
    private static final String ERRAND1 = "ИНИЦИАТИВНЫЕ ПОРУЧЕНИЯ";
    private static final String MEMORANDUM_TEST = "C3(тест)";
    private static final String MEMORANDUM_TEXT = "Служебная записка";
    private static final String BOSS = "Босс11";
    private static final String INPUT_DOC = "Входящий документ.docx";
    private static final String OUTPUT_DOC = "Договор поставки.doc";
    private static final String ORDER_DOC = "Приказ об изменении орг-штатной структуры.docx";
    private static final String MEMORANDUM_DOC = "СЗ.txt";
    private static final String ERRAND_DOC = "Распоряжение_.gif";
    private static final String PROXY_DOC = "Доверенность на курьера.png";
    private static final String ANSWER = "ответ.txt";
    private static final String REGULATORY_DOCUMENTS = "РАСПОРЯДИТЕЛЬНЫЕ ДОКУМЕНТЫ";
    private static final String ORDER_DOCUMENTS = "Приказ (пустая форма)";
    private static final String ORDER_DOCUMENTS1 = "Приказ (общий)";
    private final String ORDER = "Приказ";
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


    public static void  createDoc() {

            // исходящий документ
            CreateDocument.createDoc(OUTPUTDOCUMENT, OUTPUTDOCUMENT1);

            // добавляем контент
            sleep(10000);
            Content.contentUpload(OUTPUT_DOC);

            // переходим в реквизиты
            Buttons.requisites();


            // Краткое содержание
            $(byXpath("//*[@id=\"dss_description\"]")).setValue("Auto-test777");

            String str = $("#dsid_document_kind").getValue();
            if (str.isEmpty()) {
                $("#dsid_document_kind").setValue("Письмо");
                sleep(1000);
                $(byText("Письмо")).click();
            }



        //заполняем обязательные поля

            //Подписант
//       Fields.singer();
            if ($(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[9]/div/div/div[1]/div/div/div/div/div/div[1]/button")).isDisplayed()) {

                $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[9]/div/div/div[1]/div/div/div/div/div/div[1]/button")).click();
                $(byXpath("//*[@id=\"query\"]")).setValue(AUTOTEST_NAME1);
                $(byText("Департамент 1")).click();
                //путь к кнопке выбрать подписанта
                $$(PATH).findBy(text(BUTTON)).click();
            } else {
                $("#dsid_signer_empl").setValue(AUTOTEST_NAME1);
                sleep(10000);
                if ($(byText(AUTOTEST1)).is(visible)) {
                    $(byText(AUTOTEST1)).click();
                } else {
                    if ($(byText("Автотест1 , Зам. начальник отдела, ООО \"Айди-Технологии управления\"")).is(visible)) {
                        $(byText("Автотест1 , Зам. начальник отдела, ООО \"Айди-Технологии управления\"")).click();
                    } else {

                        $("div.form-item-container:nth-child(10) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)").click();
                        $("#query").setValue(AUTOTEST_NAME1);
                        sleep(10000);
                        if ($(byText("Тестовый отдел")).is(visible)) {
                            $(byText("Тестовый отдел")).click();
                        } else if ($(byText("ООО \"Айди-Технологии управления\"")).is(visible)){
                            $(byText("ООО \"Айди-Технологии управления\"")).click();
                        } else if ($(byText(AUTOTEST_NAME1)).is(visible)) {
                            $(byText(AUTOTEST_NAME1)).click();
                        } else if ($(byText("Тестовый Филиал")).is(visible)) {
                            $(byText("Тестовый Филиал")).click();
                        }
                        sleep(10000);
                        $$(PATH).findBy(text("Выбрать")).click();
                    }

                }


            }

            String grif = $("#dsid_stamp").getValue();

            if (grif.isEmpty()) {
                $("#dsid_stamp").click();
                sleep(1000);
                $(byText("Общего пользования")).click();
            }

            // Внешний аресат
            sleep(1000);
            if (!($("#dsid_agent_person").is(visible))) {
                $("#dsid_agent_person").scrollIntoView(true);
            }

            $("#dsid_agent_person").setValue(AUTOTEST_NAME1);
            sleep(1000);

            if ($(byText("Автотест1 А. Т.,ПАО \"ЛЕНЭНЕРГО\",Сотрудник 1")).is(visible)) {
                $$(byText("Автотест1 А. Т.,ПАО \"ЛЕНЭНЕРГО\",Сотрудник 1")).first().click();
            } else if ($(byText("Автотест3 А. Т.,ООО \"Айди-Технологии управления\",Сотрудник3")).is(visible)) {
                $(byText("Автотест3 А. Т.,ООО \"Айди-Технологии управления\",Сотрудник3")).click();
            } else if ($("div.form-item-container:nth-child(14) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)").is(visible)) {
                $("div.form-item-container:nth-child(14) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)").click();
                $("#fio").setValue(AUTOTEST_NAME3);
                sleep(1000);
                $(byText("Сотрудник3")).click();
                $$(PATH).findBy(text(BUTTON)).click();
            }



            // сохраняем
            sleep(10000);
            Buttons.save();
            sleep(10000);




            // проверяем что заполнились Регистрационный номер, Временный номер
            Buttons.content();
            Buttons.requisites();
            sleep(1000);
            registrationNumber = $(byXpath("//*[@id=\"dss_reg_number\"]")).getValue();



            // скачиваем контент
            Buttons.content();
            sleep(10000);
            $(byXpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/button[1]")).click();
            sleep(1000);


        /// переходим к проверке оформления

            //нажимаем на вкладку соласование и подписание
            sleep(10000);
            $(byText("Согласование и подписание")).click();




            //нажимаем добавить согласующего
            boolean b = $(byClassName("fs-12 flex flex-wrap ai-center stage-header tt-uppercase m-t-8 pos-relative")).isDisplayed();
            if (!b) {
                $$(byText("Добавить этап"))
                        .first()
                        .click();
            }




            //ажимаем добавить проверяющего
            Fields.checking(AUTOTEST_NAME5, DEPARTMENT5);




            //нажимаем сохранить
            $$(byText("Сохранить")).shouldHaveSize(7)
                    .get(6)
                    .click();





            //ажимаем добавить проверяющего
            if ( $(byText("Проверка оформления")).find(byText("Добавить этап")).is(visible)) {
                ElementsCollection a = $$(byText("Добавить этап"));
                if (a.size() > 1) {
                    a.get(1).click();
                }
            } else {
                boolean click = $(".layout-icon").isDisplayed();
                if (click) {
                    $(".layout-icon").click();
                } else {
                    $(byXpath("//div[4]//div[2]//div[1]//div[1]//div[3]//button[1]")).click();

                }

            }






            //ажимаем добавить проверяющего
            boolean visible = $(".layout-icon").isDisplayed();

            if (visible) {

                $(".layout-icon").click();
                $(byXpath("//*[@id=\"branchId\"]")).setValue("Тестовый Филиал");
                if ($(byText("Тестовый Филиал")).is(Condition.visible)) {

                    $(byText("Тестовый Филиал")).click();
                } else {
                    if ($(byText("Тестовый филиал")).is(Condition.visible)) {

                        $(byText("Тестовый филиал")).click();
                    } else $(byXpath("//*[@id=\"branchId\"]")).pressEnter();
                }
                sleep(1000);
                $(byXpath("//*[@id=\"query\"]")).setValue(AUTOTEST_NAME3).pressEnter();
                sleep(1000);
                if ($(byText("Департамент 3")).is(Condition.visible)) {

                    $(byText("Департамент 3")).click();
                } else {
                    $(byText(AUTOTEST_NAME3)).click();
                }
                sleep(1000);
                $$(PATH).findBy(text(BUTTON)).click();
                $$(byText("Сохранить")).shouldHaveSize(7)
                        .get(6)
                        .click();

            } else {

                $("#selectedUsers").setValue(AUTOTEST_NAME3);
                sleep(1000);
                $(byText(AUTOTEST3)).click();
                $(byText("Добавить")).click();
            }





            // на согласование
            sleep(10000);
            Buttons.agreement();
            sleep(10000);
        }

}
