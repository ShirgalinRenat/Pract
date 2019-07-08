package ru.company.project.factory.document;

import ru.company.project.model.document.Document;

/**
 * factory for production documents
 */
abstract class DocumentFactory implements Factory {

    private DocumentGenerator obtainer;

    public DocumentFactory(DocumentGenerator obtainer) {
        this.obtainer = obtainer;
    }

    public abstract Document create() throws IllegalAccessException;

    public DocumentGenerator getObtainer() {
        return obtainer;
    }


}
