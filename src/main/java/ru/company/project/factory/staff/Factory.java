package ru.company.project.factory.staff;

import ru.company.project.exceptions.DocumentExistsException;
import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

/**
 * The interface Factory.
 */
public interface Factory {
    Staff create() throws IllegalAccessException, DocumentExistsException, JAXBException, FileNotFoundException;
}
