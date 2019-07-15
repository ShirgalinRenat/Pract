package ru.company.project.factory.staff;

import org.xml.sax.SAXException;
import ru.company.project.model.staff.Organization;
import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OrganizationFactory extends StaffFactory {

    public OrganizationFactory(StaffGenerator obtainer) {
        super(obtainer);
    }

    @Override
    public Staff create() throws IllegalAccessException, JAXBException, IOException, ParserConfigurationException, SAXException {
        return getObtainer().staffObtain(new Organization());
    }


}
