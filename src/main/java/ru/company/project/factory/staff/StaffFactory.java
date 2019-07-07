package ru.company.project.factory.staff;


import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

abstract class StaffFactory implements Factory {

    private StaffObtainable obtainer;

    public StaffObtainable getObtainer(){
        return obtainer;
    }

    public StaffFactory(StaffObtainable obtainer){
        this.obtainer = obtainer;
    }

    public abstract Staff create() throws IllegalAccessException, JAXBException, FileNotFoundException;
}
