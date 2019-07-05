package ru.company.project.factory;

import ru.company.project.datamodel.Document;
import ru.company.project.exceptions.DocumentExistsException;

/**

 * The interface Factory.

 */
public interface Factory {
    Document create() throws DocumentExistsException, IllegalAccessException;
}
