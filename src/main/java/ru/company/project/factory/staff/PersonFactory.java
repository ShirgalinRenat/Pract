package ru.company.project.factory.staff;

import ru.company.project.model.staff.Person;
import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class PersonFactory extends StaffFactory {

    public PersonFactory(StaffObtainable obtainer) {
        super(obtainer);
    }

    @Override
    public Staff create() throws IllegalAccessException, JAXBException, FileNotFoundException {
        Person prs= new Person();
        getObtainer().staffObtain(prs);
        return prs;
    }

}
