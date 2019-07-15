package ru.company.project.factory.document;

import ru.company.project.model.document.Document;
import ru.company.project.model.document.Task;

public class TaskFactory extends DocumentFactory {

    public TaskFactory(DocumentGenerator data) {
        super(data);
    }

    /**
     * Создание документа Task
     *
     * @return Экземпляр документа Task
     * @throws IllegalAccessException
     */
    @Override
    public Document create() throws IllegalAccessException {
        return getObtainer().documentObtain(new Task());

    }

}
