package ru.company.project.factory;

import ru.company.project.datamodel.Document;
import ru.company.project.exceptions.DocumentExistsException;

/**

 * factory for production documents

 */
abstract class DocumentFactory implements Factory  {

    private DocumentGenerator obtainer;

    public DocumentFactory(DocumentGenerator obtainer){
        this.obtainer = obtainer;
    }

    public abstract Document create() throws DocumentExistsException, IllegalAccessException;

    public DocumentGenerator getObtainer(){
        return obtainer;
    }


}
