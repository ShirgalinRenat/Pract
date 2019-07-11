package ru.company.project.application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.xml.sax.SAXException;
import ru.company.project.exceptions.DocumentExistsException;
import ru.company.project.factory.document.IncomingFactory;
import ru.company.project.factory.document.OutgoingFactory;
import ru.company.project.factory.document.TaskFactory;
import ru.company.project.generator.RandomFieldGenerator;
import ru.company.project.model.document.Document;
import ru.company.project.storage.DocumentStorage;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;
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

        ObjectMapper objectMapper = new ObjectMapper();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Stream<Document> col = DocumentStorage.getDocumentList().stream();

        Map<String, List<Document>> namesOfAuthors = convertToTreeMap(col.collect(Collectors.groupingBy(Document::getAuthorDoc)));

        for (Map.Entry<String, List<Document>> item : namesOfAuthors.entrySet()) {

            System.out.println(item.getKey());

            for (Document document : item.getValue()) {
                System.out.println(document);

                try {
                    objectMapper.writeValue(new File("./src/main/resources/docs/" + item.getKey() + ".json"), item.getValue());
                } catch (JsonGenerationException e) {
                    e.printStackTrace();
                } catch (JsonMappingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            System.out.println();
        }


    }

    // Generic function to construct a new
    // TreeMap from HashMap
    public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap) {
        Map<K, V>
                treeMap = hashMap
                // Get the entries from the hashMap
                .entrySet()

                // Convert the map into stream
                .stream()

                // Now collect the returned TreeMap
                .collect(
                        Collectors

                                // Using Collectors, collect the entries
                                // and convert it into TreeMap
                                .toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (oldValue,
                                         newValue)
                                                -> newValue,
                                        TreeMap::new));

        // Return the TreeMap
        return treeMap;
    }


}
