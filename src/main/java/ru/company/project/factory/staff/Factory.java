package ru.company.project.factory.staff;

import org.xml.sax.SAXException;
import ru.company.project.exceptions.DocumentExistsException;
import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * The interface Factory.
 */
public interface Factory {
    Staff create() throws IllegalAccessException, DocumentExistsException, JAXBException, IOException, ParserConfigurationException, SAXException;
}
