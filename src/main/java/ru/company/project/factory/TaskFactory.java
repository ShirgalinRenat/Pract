package ru.company.project.factory;

import ru.company.project.datamodel.Document;
import ru.company.project.datamodel.Task;
import ru.company.project.exceptions.DocumentExistsException;

public class TaskFactory extends DocumentFactory {

    public TaskFactory(DocumentGenerator data) {
        super(data);
    }

    /**
     * Создание документа Task
     * @return Экземпляр документа Task
     * @throws DocumentExistsException
     * @throws IllegalAccessException
     */
    @Override
    public Document create() throws DocumentExistsException, IllegalAccessException {
        Task tsk=new Task();
        getObtainer().documentObtain(tsk);
        return tsk;
    }

}
