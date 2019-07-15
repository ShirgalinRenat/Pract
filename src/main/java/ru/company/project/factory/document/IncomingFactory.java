package ru.company.project.factory.document;

import ru.company.project.model.document.Document;
import ru.company.project.model.document.Incoming;

/**
 * The Incoming factory.
 */
public class IncomingFactory extends DocumentFactory {

    public IncomingFactory(DocumentGenerator data) {
        super(data);
    }

    /**
     * Создание документа Incoming
     *
     * @return Экземпляр документа Incoming
     * @throws IllegalAccessException
     */
    @Override
    public Document create() throws IllegalAccessException {
        Incoming inc = new Incoming();
        getObtainer().documentObtain(inc);
        return inc;
    }

}
