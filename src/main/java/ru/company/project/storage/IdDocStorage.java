package ru.company.project.storage;

import ru.company.project.datamodel.Document;
import ru.company.project.exceptions.DocumentExistsException;

import java.util.ArrayList;
import java.util.Collection;

public class IdDocStorage {
    private static Collection<Integer> idDocList=new ArrayList<>();

    public static Collection<Integer> getIdDocList(){
        return idDocList;
    }

    public static void add(Document doc) throws DocumentExistsException{
        if(idDocList.contains(doc.getId())) {
            throw new DocumentExistsException(doc);
        } else {
            idDocList.add(doc.getId());
        }
    }
}
