package ru.company.project.storage;

import ru.company.project.datamodel.Document;

import java.util.ArrayList;
import java.util.List;

/**

 * Store all existing Documents

 */
public class DocumentStorage {

    private DocumentStorage(){

    }

    private static List<Document> documentList = new ArrayList<>();

    public static List<Document> getDocumentList() {

        return documentList;
    }

}
