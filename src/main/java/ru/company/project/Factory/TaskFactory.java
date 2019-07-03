package ru.company.project.factory;

import ru.company.project.datamodel.Document;
import ru.company.project.datamodel.Task;
import ru.company.project.exceptions.DocumentExistsException;

public class TaskFactory extends DocumentFactory {

    public TaskFactory(DataOptainable data) {
        super(data);
    }

    /**
     *
     * @return Экземпляр документа Task
     * @throws DocumentExistsException
     * @throws IllegalAccessException
     */
    @Override
    public Document create() throws DocumentExistsException, IllegalAccessException {
        Task tsk=new Task();
        getObtainer().dataOptain(tsk);
        return tsk;
    }

}
