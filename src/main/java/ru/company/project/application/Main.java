package ru.company.project.application;

import ru.company.project.generator.RandomFieldGenerator;
import ru.company.project.model.document.Document;
import ru.company.project.factory.document.IncomingFactory;
import ru.company.project.factory.document.OutgoingFactory;
import ru.company.project.factory.document.TaskFactory;
import ru.company.project.storage.DocumentStorage;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        DocumentStorage.addDoc(new IncomingFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new TaskFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new OutgoingFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new IncomingFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new TaskFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new OutgoingFactory(new RandomFieldGenerator()).create());

        Stream<Document> col = DocumentStorage.getDocumentList().stream();

        Map<String, List<Document>> namesOfAuthors = col.collect(Collectors.groupingBy(Document::getAuthorDoc));

        for(Map.Entry<String, List<Document>> item : namesOfAuthors.entrySet()){

            System.out.println(item.getKey());
            for(Document document : item.getValue()){
                System.out.println(document);
            }
            System.out.println();
        }

    }

}
