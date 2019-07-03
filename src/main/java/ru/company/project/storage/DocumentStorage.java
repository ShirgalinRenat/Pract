package ru.company.project.storage;

import ru.company.project.datamodel.Document;

import java.util.ArrayList;
import java.util.List;

public class DocumentStorage {

    private DocumentStorage(){

    }

    private static List<Document> documentList = new ArrayList<>();

    public static List<Document> getDocumentList() {
        return documentList;
    }

    public static void setDocumentList(List<Document> documentList) {
        DocumentStorage.documentList=documentList;
    }

    public static void addDoc(Document document) {
        DocumentStorage.documentList.add(document);
    }



}
