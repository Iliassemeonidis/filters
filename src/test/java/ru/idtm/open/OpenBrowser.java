package ru.idtm.open;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;

public class OpenBrowser {

    private static String leSt = "http://172.25.144.151/";
    private static String leProd = "http://172.25.144.163";
    private static String leTest = "https://le-sedo.devel/";
    private static String volsSt = "http://185.187.112.58/";
    private static String rossSet = "http://172.24.68.146";
    private static String tNt = "https://tnt.documino.com/";

    public static String getLeSt() {
        return leSt;
    }

    public static String getLeProd() {
        return leProd;
    }

    public static String getLeTest() {
        return leTest;
    }

    public static String getVolsSt() {
        return volsSt;
    }

    public static String getRossSet() {
        return rossSet;
    }

    public static String gettNt() {
        return tNt;
    }

    public static void openLeSt() {
        browser = "firefox";
        open("http://172.25.144.151/");// стейдж


    }

    public static void openLeProd() {
        browser = "firefox";
        open("http://172.25.144.163");// прод

    }

    public static void openLeTest() {
        browser = "firefox";
        open("https://le-sedo.devel/");// тест(дев)

    }

    public static void openVolsSt() {
        browser = "firefox";
        open("http://185.187.112.58/");// волс cт

    }

    public static void openRossSet() {
        browser = "firefox";
        open("http://172.24.68.146");// рос сети

    }

    public static void openTNT() {
        browser = "firefox";
        open("https://tnt.documino.com/");// tnt

    }


}
