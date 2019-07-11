package ru.company.project.application;

import org.xml.sax.SAXException;
import ru.company.project.factory.staff.DepartmentFactory;
import ru.company.project.factory.staff.OrganizationFactory;
import ru.company.project.factory.staff.PersonFactory;
import ru.company.project.model.staff.Staff;
import ru.company.project.parser.JAXBParser;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ParseXML {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, JAXBException, IllegalAccessException {
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
