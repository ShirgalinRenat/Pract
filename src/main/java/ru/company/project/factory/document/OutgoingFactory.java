package ru.company.project.factory.document;

import ru.company.project.model.document.Document;
import ru.company.project.model.document.Outgoing;

public class OutgoingFactory extends DocumentFactory {

    public OutgoingFactory(DocumentObtainable data) {
        super(data);
    }

    /**
     * Создание документа Outgoing
     *
     * @return Экземпляр документа Outgoing
     * @throws IllegalAccessException
     */
    @Override
    public Document create() throws  IllegalAccessException {
        Outgoing out = new Outgoing();
        getObtainer().documentObtain(out);
        return out;
    }
}
