package ru.company.project.factory.document;

import ru.company.project.model.document.Document;

/**
 * factory for production documents
 */
abstract class DocumentFactory implements Factory {

    private DocumentObtainable obtainer;

    public DocumentFactory(DocumentObtainable obtainer) {
        this.obtainer = obtainer;
    }

    public abstract Document create() throws IllegalAccessException;

    public DocumentObtainable getObtainer() {
        return obtainer;
    }


}
