package ru.company.project.appearance;

import ru.company.project.datamodel.Document;

import java.util.Comparator;


public class DocumentByNameComparator implements Comparator<Document> {
    @Override
    public int compare(Document o1, Document o2) {
        return o1.getAuthorDoc().compareTo(o2.getAuthorDoc());
    }
}
