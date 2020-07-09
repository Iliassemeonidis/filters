package ru.idtm.content;

import com.codeborne.selenide.ElementsCollection;

import java.io.File;

import static com.codeborne.selenide.Selenide.$$;

public class Content {
    public static void contentUpload(String fileName) {

        $$("input")
                .first()
                .uploadFile(new File(fileName));

    }
    public static void contentUploadForAnswer(String fileName) {


        ElementsCollection elements = $$("input");
        if (elements.size() > 3) {
            elements
                    .get(2)
                    .uploadFile(new File(fileName));
        } else {
            elements
                    .get(1)
                    .uploadFile(new File(fileName));
        }


    }

}
