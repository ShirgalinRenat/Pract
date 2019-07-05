package ru.company.project.factory;

import ru.company.project.datamodel.Document;
import ru.company.project.datamodel.Outgoing;
import ru.company.project.exceptions.DocumentExistsException;

public class OutgoingFactory extends DocumentFactory  {

    public OutgoingFactory(DocumentGenerator data) {
        super(data);
    }

    /**
     * Создание документа Outgoing
     * @return Экземпляр документа Outgoing
     * @throws DocumentExistsException
     * @throws IllegalAccessException
     */
    @Override
    public Document create() throws DocumentExistsException, IllegalAccessException {
        Outgoing out=new Outgoing();
        getObtainer().documentObtain(out);
        return out;
    }
}
