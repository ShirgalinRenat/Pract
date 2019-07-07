package ru.company.project.factory.staff;


import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public interface StaffObtainable {
    public void staffObtain(Staff staff) throws IllegalAccessException, JAXBException, FileNotFoundException;
}
