package ru.company.project.utils;

import ru.company.project.appearance.DocumentByNameComparator;
import ru.company.project.datamodel.Document;
import ru.company.project.exceptions.DocumentExistsException;
import ru.company.project.factory.IncomingFactory;
import ru.company.project.factory.OutgoingFactory;
import ru.company.project.factory.TaskFactory;
import ru.company.project.storage.DocumentStorage;

import java.util.Collections;



public class Main {

    public static void main(String[] args) throws DocumentExistsException, IllegalAccessException {

        DocumentStorage.addDoc(new IncomingFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new TaskFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new OutgoingFactory(new RandomFieldGenerator()).create());


        Collections.sort(DocumentStorage.getDocumentList(),new DocumentByNameComparator());
        for (Document item: DocumentStorage.getDocumentList()) {
            System.out.println(item);
        }

    }

}
