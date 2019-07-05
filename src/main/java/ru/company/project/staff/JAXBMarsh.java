package ru.company.project.staff;


import ru.company.project.utils.RandomFieldGenerator;

import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBMarsh {
    public static void main(String[] args) throws JAXBException, IOException, IllegalAccessException {
        Organization organization = (Organization) new Organization(new RandomFieldGenerator()).create();

        Department department = (Department) new Department(new RandomFieldGenerator()).create();

        Person person= (Person) new Person(new RandomFieldGenerator()).create();

        JAXBContext context1 = JAXBContext.newInstance(Organization.class);
        JAXBContext context2 = JAXBContext.newInstance(Department.class);
        JAXBContext context3 = JAXBContext.newInstance(Person.class);

        Marshaller mar1 = context1.createMarshaller();
        Marshaller mar2 = context2.createMarshaller();
        Marshaller mar3 = context3.createMarshaller();

        mar1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar3.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        mar1.marshal(organization, new File("./src/main/resources/Organization.xml"));
        mar2.marshal(department, new File("./src/main/resources/Department.xml"));
        mar3.marshal(person, new File("./src/main/resources/Person.xml"));

    }
}
