package ru.company.project.factory.staff;

import ru.company.project.model.staff.Department;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class DepartmentFactory extends StaffFactory {


    public DepartmentFactory(StaffObtainable data) {
        super(data);
    }

    @Override
    public Department create() throws IllegalAccessException, JAXBException, FileNotFoundException {
        Department dpt = new Department();
        dpt.debug="deeep";
        getObtainer().staffObtain(dpt);
        return dpt;
    }

}
