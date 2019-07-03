package ru.company.project.factory;

import ru.company.project.datamodel.Document;
import ru.company.project.exceptions.DocumentExistsException;

abstract class DocumentFactory implements Factory  {

    private DataOptainable obtainer;

    public DocumentFactory(DataOptainable obtainer){
        this.obtainer = obtainer;
    }

    public abstract Document create() throws DocumentExistsException, IllegalAccessException;

    public DataOptainable getObtainer(){
        return obtainer;
    }


}
