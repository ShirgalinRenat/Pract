package ru.company.project.factory.staff;

import org.xml.sax.SAXException;
import ru.company.project.model.staff.Department;
import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DepartmentFactory extends StaffFactory {


    public DepartmentFactory(StaffGenerator data) {
        super(data);
    }

    @Override
    public Staff create() throws IllegalAccessException, JAXBException, IOException, ParserConfigurationException, SAXException {
        return getObtainer().staffObtain(new Department());
    }

}
