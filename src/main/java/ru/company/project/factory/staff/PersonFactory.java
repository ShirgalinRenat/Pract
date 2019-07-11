package ru.company.project.factory.staff;

import org.xml.sax.SAXException;
import ru.company.project.model.staff.Person;
import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonFactory extends StaffFactory {

    public PersonFactory(StaffGenerator obtainer) {
        super(obtainer);
    }

    @Override
    public Staff create() throws IllegalAccessException, JAXBException, IOException, ParserConfigurationException, SAXException {
        return getObtainer().staffObtain(new Person());
    }

}
