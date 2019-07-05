package ru.company.project.exceptions;

import ru.company.project.datamodel.Document;

import java.text.MessageFormat;

/**

 * The Document exists exception.

 * Throw Exception with id of duplicated document

 */
public class DocumentExistsException extends Exception {
    public DocumentExistsException(Document doc) {
        //super("Документ с регистрационным номером " + doc.getRegNum() + " уже существует");
        new MessageFormat("Документ с регистрационным номером " + doc.getRegNum() + " уже существует");
    }

    public DocumentExistsException(String errorMessage) {
        super(errorMessage);
    }
}
