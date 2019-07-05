package ru.company.project.storage;

import ru.company.project.staff.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonStorage {

    private PersonStorage() {
    }

    private static List<Person> personList = new ArrayList<>();

    public static List<Person> getPersonList() {
        return personList;
    }

    public static void setPersonList(List<Person> personList) {
        PersonStorage.personList = personList;
    }
}
