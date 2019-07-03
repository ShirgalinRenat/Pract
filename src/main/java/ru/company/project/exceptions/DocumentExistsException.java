package ru.company.project.exceptions;

import ru.company.project.datamodel.Document;

/*
Исключение уведомляющие о документе с уже существующим id
 */
public class DocumentExistsException extends Exception {
    public DocumentExistsException(Document doc) {
        super("Документ с регистрационным номером " + doc.getRegNum() + " уже существует");
    }

    public DocumentExistsException(String errorMessage) {
        super(errorMessage);
    }
}
