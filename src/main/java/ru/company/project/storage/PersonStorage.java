package ru.company.project.storage;

import ru.company.project.factory.staff.PersonFactory;

import java.util.ArrayList;
import java.util.List;

public class PersonStorage {

    private PersonStorage() {
    }

    private static List<PersonFactory> personFactoryList = new ArrayList<>();

    public static List<PersonFactory> getPersonFactoryList() {
        return personFactoryList;
    }

    public static void setPersonFactoryList(List<PersonFactory> personFactoryList) {
        PersonStorage.personFactoryList = personFactoryList;
    }
}
