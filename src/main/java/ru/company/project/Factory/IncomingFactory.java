package ru.company.project.factory;

import ru.company.project.datamodel.Document;
import ru.company.project.datamodel.Incoming;
import ru.company.project.exceptions.DocumentExistsException;

public class IncomingFactory extends DocumentFactory {

    public IncomingFactory(DataOptainable data) {
        super(data);
    }

    /**
     *
     * @return Экземпляр документа Incoming
     * @throws DocumentExistsException
     * @throws IllegalAccessException
     */
    @Override
    public Document create() throws DocumentExistsException, IllegalAccessException {
        Incoming inc=new Incoming();
        getObtainer().dataOptain(inc);
        return inc;
    }

}
