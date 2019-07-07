package ru.company.project.factory.staff;

import ru.company.project.model.staff.Organization;
import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class OrganizationFactory extends StaffFactory {

    public OrganizationFactory(StaffObtainable obtainer) {
        super(obtainer);
    }

    @Override
    public Staff create() throws IllegalAccessException, JAXBException, FileNotFoundException {
        Organization org = new Organization();
        getObtainer().staffObtain(org);
        return org;
    }


}
