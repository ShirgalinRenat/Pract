package ru.company.project.factory.staff;


import org.xml.sax.SAXException;
import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface StaffGenerator {
    public Staff staffObtain(Staff staff) throws IllegalAccessException, JAXBException, IOException, SAXException, ParserConfigurationException;
}
