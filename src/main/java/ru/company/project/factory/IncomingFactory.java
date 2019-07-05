package ru.company.project.factory;

import ru.company.project.datamodel.Document;
import ru.company.project.datamodel.Incoming;
import ru.company.project.exceptions.DocumentExistsException;

/**

 * The Incoming factory.

 */
public class IncomingFactory extends DocumentFactory {

    public IncomingFactory(DocumentGenerator data) {
        super(data);
    }

    /**
     * Создание документа Incoming
     * @return Экземпляр документа Incoming
     * @throws DocumentExistsException
     * @throws IllegalAccessException
     */
    @Override
    public Document create() throws DocumentExistsException, IllegalAccessException {
        Incoming inc=new Incoming();
        getObtainer().documentObtain(inc);
        return inc;
    }

}
