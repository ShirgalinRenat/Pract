package ru.company.project.utils;

import ru.company.project.factory.staff.DepartmentFactory;
import ru.company.project.model.document.Document;
import ru.company.project.exceptions.DocumentExistsException;
import ru.company.project.factory.document.IncomingFactory;
import ru.company.project.factory.document.OutgoingFactory;
import ru.company.project.factory.document.TaskFactory;
import ru.company.project.model.staff.Department;
import ru.company.project.model.staff.Staff;
import ru.company.project.storage.DocumentStorage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws DocumentExistsException, IllegalAccessException, JAXBException, FileNotFoundException {

        /*DocumentStorage.addDoc(new IncomingFactory(new RandomFieldGenerator()).create());
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
        }*/

        Department d=new DepartmentFactory(new JAXBMarshaller("./src/main/resources/Department.xml")).create();
        System.out.println(d);

        /*JAXBContext context = JAXBContext.newInstance(Department.class);
        Staff dep= (Staff) context.createUnmarshaller()
                .unmarshal(new FileReader("./src/main/resources/Department.xml"));
        System.out.println(dep);*/


        /*Collections.sort(DocumentStorage.getDocumentList(), new DocumentByNameComparator());
        for (Document item : DocumentStorage.getDocumentList()) {
            System.out.println(item);
        }*/

    }

}
