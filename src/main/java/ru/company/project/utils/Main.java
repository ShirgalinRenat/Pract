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

        DocumentStorage.getDocumentList().add(new IncomingFactory(new RandomFieldGenerator()).create());
        DocumentStorage.getDocumentList().add(new TaskFactory(new RandomFieldGenerator()).create());
        DocumentStorage.getDocumentList().add(new OutgoingFactory(new RandomFieldGenerator()).create());

        /*Stream<Document> col = DocumentStorage.getDocumentList().stream();

        Map<String, List<Document>> namesOfAuthors = col.collect(Collectors.groupingBy(Document::getAuthorDoc));

        for(Map.Entry<String, List<Document>> item : namesOfAuthors.entrySet()){

            System.out.println(item.getKey());
            for(Document document : item.getValue()){

                System.out.println(document.getDocName());
            }
            System.out.println();
        }*/

        Collections.sort(DocumentStorage.getDocumentList(),new DocumentByNameComparator());
        for (Document item: DocumentStorage.getDocumentList()) {
            System.out.println(item);
        }

    }

}
