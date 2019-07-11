package ru.company.project.factory.document;

import ru.company.project.model.document.Document;
import ru.company.project.exceptions.DocumentExistsException;

/**
 * The interface Factory.
 */
public interface Factory {
    Document create() throws DocumentExistsException, IllegalAccessException;
}
