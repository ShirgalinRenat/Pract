package ru.company.project.application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.xml.sax.SAXException;
import ru.company.project.exceptions.DocumentExistsException;
import ru.company.project.factory.document.IncomingFactory;
import ru.company.project.factory.document.OutgoingFactory;
import ru.company.project.factory.document.TaskFactory;
import ru.company.project.factory.staff.DepartmentFactory;
import ru.company.project.factory.staff.OrganizationFactory;
import ru.company.project.factory.staff.PersonFactory;
import ru.company.project.generator.RandomFieldGenerator;
import ru.company.project.model.document.Document;
import ru.company.project.model.staff.Staff;
import ru.company.project.parser.JAXBParser;
import ru.company.project.storage.DocumentStorage;
import ru.company.project.utils.MapConverter;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) throws DocumentExistsException, IllegalAccessException, JAXBException, IOException, ParserConfigurationException, SAXException {

        DocumentStorage.addDoc(new IncomingFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new TaskFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new OutgoingFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new IncomingFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new TaskFactory(new RandomFieldGenerator()).create());
        DocumentStorage.addDoc(new OutgoingFactory(new RandomFieldGenerator()).create());

        Stream<Document> col = DocumentStorage.getDocumentList().stream();

        Map<String, List<Document>> namesOfAuthors = MapConverter.convertToTreeMap(col.collect(Collectors.groupingBy(Document::getAuthorDoc)));

        for (Map.Entry<String, List<Document>> item : namesOfAuthors.entrySet()) {

            System.out.println(item.getKey());

            for (Document document : item.getValue()) {
                System.out.println(document);

                try (Writer writer = new FileWriter("./src/main/resources/docs/" + item.getKey() + ".json")) {
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    gson.toJson(item.getValue(), writer);
                }

            }

            System.out.println();
        }

        /*
        *Parse xml
         */
        DepartmentFactory df = new DepartmentFactory(new JAXBParser("./src/main/resources/xml/Department.xml", "department"));
        OrganizationFactory of = new OrganizationFactory(new JAXBParser("./src/main/resources/xml/Organization.xml", "organization"));
        PersonFactory pf = new PersonFactory(new JAXBParser("./src/main/resources/xml/Person.xml", "person"));
        Staff dep;
        while ((dep = df.create()) != null) {
            System.out.println(dep);
        }
        while ((dep = of.create()) != null) {
            System.out.println(dep);
        }
        while ((dep = pf.create()) != null) {
            System.out.println(dep);
        }

    }


}
