package ru.idtm.filter;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.junit.ScreenShooter;
import io.cucumber.java.ru.А;
import org.junit.Rule;
import org.junit.Test;
import ru.idtm.buttons.Buttons;
import ru.idtm.check.Check;
import ru.idtm.filters.Filters;
import ru.idtm.inputdoc.InputDocument;
import ru.idtm.memorandum.MemorandumText;
import ru.idtm.open.OpenBrowser;
import ru.idtm.order.OrderDoc;
import ru.idtm.output.OutputDocument;
import ru.idtm.users.UserChange;
import ru.idtm.workwithdocuments.WorkWithDocuments;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FilterTest {
    public final String BUTTON = "Выбрать";
    public final String PATH = "html body.el-popup-parent--hidden div.el-dialog__wrapper div.el-dialog.user-list-dialogue-wrapper div.el-dialog__footer span.dialog-footer button.primary.default-margin-right.btn-def.fs-12";
    public final String CONTENT = "Контент";
    public final String INPUTDOCUMENT = "ВХОДЯЩИЕ ДОКУМЕНТЫ";
    public final String OUTPUTDOCUMENT = "ИСХОДЯЩИЕ ДОКУМЕНТЫ";
    public final String INTERNAL_DOCUMENTS = "ВНУТРЕННИЕ ДОКУМЕНТЫ";
    public final String ERRAND = "ИНИЦИАТИВНОЕ ПОРУЧЕНИЕ";
    public final String MEMORANDUM_TEST = "C3(тест)";
    public final String MEMORANDUM_TEXT = "Служебная записка";
    public final String BOSS = "Босс11";
    public final String INPUT_DOC = "Входящий документ.docx";
    public final String OUTPUT_DOC = "Исходящий выставка.png";
    public final String ORDER_DOC = "Приказ об изменении орг-штатной структуры.docx";
    public final String MEMORANDUM_DOC = "СЗ.txt";
    public final String ERRAND_DOC = "Распоряжение_.gif";
    public final String PROXY_DOC = "Доверенность на курьера.png";
    public final String ANSWER = "ответ.txt";
    public final String REGULATORY_DOCUMENTS = "РАСПОРЯДИТЕЛЬНЫЕ ДОКУМЕНТЫ";
    public final String ORDER_DOCUMENTS = "Приказ (пустая форма)";
    public final String ORDER_DOCUMENTS1 = "Приказ (общий)";
    public final String ORDER = "Приказ";
    public static String registrationNumber = "Тест/01/221";
    public static String output = "Исходящие документы";
    public static String input = "Входящие документы";
    public static String ALL_TASKS = "Все задания";
    public static String identifier;
    public static String temporaryNumber;
    public static String description;
    public static String singer;
    public static String organization;
    public static String department;
    public static String correspondentNumber;
    public static String correspondent;
    public static String adress;
    public static String author;
    public static String executor;
    public static boolean visible;
    public static final String AUTOTEST1 = "Автотест1 , Сотрудник, Департамент 1";
    public static final String AUTOTEST_NAME1 = "Автотест1";
    public static final String AUTOTEST2 = "Автотест2 , Сотрудник, Департамент 2";
    public static final String AUTOTEST_NAME2 = "Автотест2";
    public static final String AUTOTEST3 = "Автотест3 , Сотрудник, Департамент 3";
    public static final String AUTOTEST_NAME3 = "Автотест3";
    private static final String AUTOTEST4 = "Автотест4 , Сотрудник, Департамент 4";
    private static final String AUTOTEST_NAME4 = "Автотест4";
    private static final String AUTOTEST5 = "Автотест5 , Сотрудник, Департамент 5";
    private static final String AUTOTEST_NAME5 = "Автотест5";
    private static final String DEPARTMENT1 = "Департамент 1";
    private static final String DEPARTMENT2 = "Департамент 2";
    private static final String DEPARTMENT3 = "Департамент 3";
    private static final String DEPARTMENT4 = "Департамент 4";
    private static final String DEPARTMENT5 = "Департамент 5";
    private static ElementsCollection check;


    @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests().succeededTests();

    @Test
    public void test_01() {
        OpenBrowser.openLeTest();

        /// sleep(10000);
        UserChange.comInAutotest1();
    }

///////// распорядительные доки
    //    @Test
//    public void test_02() {
//        OrderDoc.createOrder();
//    }
//
//    }
//    @Test
//    public void test_05() {
//        Filters.type("Распорядительные документы");
//    }
//
//    @Test
//    public void test_06() {
//        // проверка оформления
//        Filters.filter("Проверка оформления");
//    }

//    @Test
//    public void test_07() {
//        $(".table-scroll-bar").shouldNotHave(text("Снять с контроля"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Смена адресата"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка исполнения"));
//        $(".table-scroll-bar").shouldNotHave(text("На печать"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание"));
//        $(".table-scroll-bar").shouldNotHave(text("Согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка(исполнение)"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение(отв)"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка"));
//        $(".table-scroll-bar").shouldNotHave(text("Ознакомление"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание контрагентом"));
//        $(".table-scroll-bar").shouldNotHave(text("Доп. согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание обществом"));
//    }
//
//
//    @Test
//    public void test_08() {
//        Check.check("Проверка оформления", AUTOTEST_NAME1);
//    }
//
//    @Test
//    public void test_09() {
//        // возвращаем с проверки оформления
//        sleep(10000);
//        $(".red").click();
//        $(byText("Правки по тексту")).click();
//        $$(byText("Вернуть")).shouldHaveSize(5)
//                .get(4)
//                .click();
//    }
//
//
//    @Test
//    public void test_10() {
//        sleep(10000);
//        WorkWithDocuments.visibleElementMyTasks(ALL_TASKS);
//        Buttons.allTasks();
//        Filters.type("Распорядительные документы");
//        Filters.filter("Доработка");
//    }
//
//
//    @Test
//    public void test_11() {
//        $(".table-scroll-bar").shouldNotHave(text("Снять с контроля"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Смена адресата"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка исполнения"));
//        $(".table-scroll-bar").shouldNotHave(text("На печать"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание"));
//        $(".table-scroll-bar").shouldNotHave(text("Согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка(исполнение)"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение(отв)"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка оформления"));
//        $(".table-scroll-bar").shouldNotHave(text("Ознакомление"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание контрагентом"));
//        $(".table-scroll-bar").shouldNotHave(text("Доп. согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание обществом"));
//    }
//
//    @Test
//    public void test_12() {
//        Check.check("Доработка", AUTOTEST_NAME1);
//
//        if ($(byText("Отправить повторно")).is(Condition.visible)) {
//            Buttons.bringBack();
//        } else {
//            Buttons.forAllWhoAreNot();
//        }
//    }
//
//    @Test
//    public void test_13() {
//        Buttons.allTasks();
////        Filters.filter("Проверка оформления");
////        Filters.type("Распорядительные документы");
////        Check.check("Проверка оформления", AUTOTEST_NAME1);
//        $(byText("Проверка оформления (повторно)")).click();
//        Buttons.complete();
//    }

//    @Test
//    public void test_14() {
//// согласование
//        sleep(10000);
//        WorkWithDocuments.visibleElementMyTasks(ALL_TASKS);
//        Buttons.allTasks();
//        Filters.type("Распорядительные документы");
//        Filters.filter("Согласование");
//    }

//    @Test
//    public void test_15() {
//        $(".table-scroll-bar").shouldNotHave(text("Снять с контроля"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Смена адресата"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка исполнения"));
//        $(".table-scroll-bar").shouldNotHave(text("На печать"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка(исполнение)"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение(отв)"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка оформления"));
//        $(".table-scroll-bar").shouldNotHave(text("Ознакомление"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание контрагентом"));
//        $(".table-scroll-bar").shouldNotHave(text("Доп. согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание обществом"));
//    }

//    @Test
//    public void test_16() {
//        Check.check("Согласование",AUTOTEST_NAME1);
//        Buttons.approve();
//    }


//    @Test
//    public void test_17() {
//        sleep(10000);
//        WorkWithDocuments.visibleElementMyTasks(ALL_TASKS);
//        Buttons.allTasks();
//        Filters.type("Распорядительные документы");
//        Filters.filter("Подписание");
//    }
//
//
//    @Test
//    public void test_18() {
//        $(".table-scroll-bar").shouldNotHave(text("Снять с контроля"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Смена адресата"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка исполнения"));
//        $(".table-scroll-bar").shouldNotHave(text("На печать"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка оформления"));
//        $(".table-scroll-bar").shouldNotHave(text("Согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка(исполнение)"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение(отв)"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка"));
//        $(".table-scroll-bar").shouldNotHave(text("Ознакомление"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание контрагентом"));
//        $(".table-scroll-bar").shouldNotHave(text("Доп. согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание обществом"));
//    }

//    @Test
//    public void test_19() {
//        //Check.check("Подписание", AUTOTEST_NAME1);
//        // временно
//        $(byText("Подписание (повторно)")).click();
//    }
//
//    @Test
//    public void test_20() {
//        //Подписываем
//        Buttons.sing();
//    }




/////// /// Входищие доки
//
//    @Test
//    public void test_21() {
//        InputDocument.createDoc();
//    }
//
//
//    @Test
//    public void test_22() {
//        Buttons.allTasks();
////        sleep(10000);
////        Filters.type("Входящие документы");
//        // на данный момент в фильрах нет такого жц дока так что его напишем но пока не будем использовать
//        //   Filters.filter("Предворительное рассмотрение");
//    }


//    @Test
//    public void test_23() {
//        $(".table-scroll-bar").shouldNotHave(text("Снять с контроля"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Смена адресата"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка исполнения"));
//        $(".table-scroll-bar").shouldNotHave(text("На печать"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка оформления"));
//        $(".table-scroll-bar").shouldNotHave(text("Согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка(исполнение)"));
//        $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение(отв)"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание"));
//        $(".table-scroll-bar").shouldNotHave(text("Ознакомление"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание контрагентом"));
//        $(".table-scroll-bar").shouldNotHave(text("Доп. согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание обществом"));
//    }

//
//
//    @Test
//    public void test_24() {
//
//        sleep(10000);
//        Check.check("Предварительное рассмотрение", AUTOTEST_NAME1);
//        Buttons.accept();
//    }


//    @Test
//    public void test_25() {
//        Buttons.allTasks();
//      //  Filters.type("Входящие документы");
//        // пока не используем фильтр
//        // Filters.filter("Предворительное рассмотрение");
//
//    }
//
//    @Test
//    public void test_26() {
//        sleep(1000);
//        Check.check("Предварительное рассмотрение", AUTOTEST_NAME1);
//        Buttons.in_resolution();
//    }
//
//    @Test
//    public void     test_27() {
//        Buttons.allTasks();
//        Filters.type("Входящие документы");
//        Filters.filter("Рассмотрение");
//    }
//    @Test
//    public void test_28() {
//        $(".table-scroll-bar").shouldNotHave(text("Снять с контроля"));
//        $(".table-scroll-bar").shouldNotHave(text("Предварительное рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка исполнения"));
//        $(".table-scroll-bar").shouldNotHave(text("На печать"));
//        $(".table-scroll-bar").shouldNotHave(text("Проверка оформления"));
//        $(".table-scroll-bar").shouldNotHave(text("Согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Доработка(исполнение)"));
//    //    $(".table-scroll-bar").shouldNotHave(text("Рассмотрение"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение(отв)"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание"));
//        $(".table-scroll-bar").shouldNotHave(text("Ознакомление"));
//        $(".table-scroll-bar").shouldNotHave(text("Исполнение"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание контрагентом"));
//        $(".table-scroll-bar").shouldNotHave(text("Доп. согласование"));
//        $(".table-scroll-bar").shouldNotHave(text("Подписание обществом"));
//
//    }
//
//    @Test
//    public void test_29() {
//        Check.check("Рассмотрение", AUTOTEST_NAME1);
//        Buttons.falseAddressee();
//    }
//
//    @Test
//    public void test_30() {
//        Buttons.allTasks();
//        Filters.type("Входящие документы");
//        Filters.filter("Смена адресата");
//    }
//
//    @Test
//    public void test_31() {
//        Check.check("Смена адресата", AUTOTEST_NAME1);
//    }
//
//    @Test
//    public void test_32() {
//        Buttons.redirect();
//        $(byText("Правки по тексту")).click();
//        $(".layout-icon").click();
//        $("#query").setValue(AUTOTEST_NAME1);
//        if ($(byText(AUTOTEST_NAME1)).is(Condition.visible)) {
//            $(byText(AUTOTEST_NAME1)).click();
//            $$(PATH).findBy(text(BUTTON)).click();
//        } else if ($(byText("Тестовый Филиал")).is(Condition.visible)) {
//            $(byText("Тестовый Филиал")).click();
//            $$(PATH).findBy(text(BUTTON)).click();
//        }
//
//        $$(byText("Отправить"))
//                .last()
//                .click();
//    }

///////////////// //Служебная записка


//    @Test
//    public void test_33() {
//        MemorandumText.createMemorandum();
//    }

    /*
    Находим служебку
    Отклоняем с согл
    Находим подписываем
     */

//    @Test
//    public void test_34() {
//        Buttons.allTasks();
//        Filters.type("Внутренние документы");
//        Filters.filter("Подписание");
//    }
//
//    @Test
//    public void test_35() {
//        Check.check("Подписание", AUTOTEST_NAME1);
//        Buttons.reject();
//        $("#reportText").setValue("Отклоняем");
//        $$(byText("Отклонить"))
//                .last()
//                .click();
//
//
//    }
//
//    @Test
//    public void test_36() {
//        Buttons.allTasks();
//        Filters.type("Внутренние документы");
//        Filters.filter("Доработка");
//    }
//
//    @Test
//    public void test_39() {
//        Check.check("Доработка", AUTOTEST_NAME1);
//        Buttons.toSing();
//    }
/*  пока этот блок не открыват , так как в фильтрах нет нужнорго статуса дока
    @Test
    public void test_40() {
        Buttons.allTasks();
        Filters.type("Внутренние документы");
        Filters.filter("Подписание (повторно)");
    }

    @Test
    public void test_41() {
        Check.check("Подписание (повторно)", AUTOTEST_NAME1);
        Buttons.sing();
    }
    */
///////////////////////

        @Test
    public void test_42() {
            OutputDocument.createDoc();
        }


//
//
//    @Test
//    public void test_28() {
//        Buttons.allTasks();
//        Filters.filter("Проверка оформления");
//        /// подумать как проверить что нет других типов дока
//        Check.check("Проверка оформления", AUTOTEST_NAME1);
//    }


//    @Test
//    public void exportExel() {
//        $("div.el-tooltip:nth-child(4)").click();
//    }


}
