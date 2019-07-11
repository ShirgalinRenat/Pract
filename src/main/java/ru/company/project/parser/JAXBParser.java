package ru.company.project.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.company.project.factory.staff.StaffGenerator;
import ru.company.project.model.staff.*;

public class JAXBParser implements StaffGenerator {
    private NodeList nList;
    private int temp = 0;

    public JAXBParser(String filePath, String tag) throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(filePath));
        document.getDocumentElement().normalize();
        nList = document.getElementsByTagName(tag);

    }

    @Override
    public Staff staffObtain(Staff staff) {

        Node node = nList.item(temp);
        if (node == null) staff = null;
        else if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element eElement = (Element) node;

            switch (staff.getClass().getAnnotation(ClassType.class).value()) {
                case DEPARTMENT:

                    Department department = (Department) staff;
                    department.setFullName(eElement.getElementsByTagName("fullName").item(0).getTextContent());
                    department.setShortName(eElement.getElementsByTagName("shortName").item(0).getTextContent());
                    department.setBoss(eElement.getElementsByTagName("boss").item(0).getTextContent());
                    department.setPhoneNumber(eElement.getElementsByTagName("phoneNumber").item(0).getTextContent());

                    break;
                case ORGANIZATION:
                    Organization organization = (Organization) staff;
                    organization.setFullName(eElement.getElementsByTagName("fullName").item(0).getTextContent());
                    organization.setShortName(eElement.getElementsByTagName("shortName").item(0).getTextContent());
                    organization.setBoss(eElement.getElementsByTagName("boss").item(0).getTextContent());
                    organization.setPhoneNumber(eElement.getElementsByTagName("phoneNumber").item(0).getTextContent());
                    break;
                case PERSON:
                    Person person = (Person) staff;
                    person.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                    person.setPatronymic(eElement.getElementsByTagName("patronymic").item(0).getTextContent());
                    person.setPosition(eElement.getElementsByTagName("position").item(0).getTextContent());
                    person.setSurName(eElement.getElementsByTagName("surName").item(0).getTextContent());
                    break;
            }

        }
        temp++;
        return staff;
    }
}