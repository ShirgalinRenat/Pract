package ru.company.project.factory.staff;


import org.xml.sax.SAXException;
import ru.company.project.model.staff.Staff;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;

abstract class StaffFactory implements Factory {

    private StaffGenerator obtainer;

    public StaffGenerator getObtainer() {
        return obtainer;
    }

    public StaffFactory(StaffGenerator obtainer) {
        this.obtainer = obtainer;
    }

    public abstract Staff create() throws IllegalAccessException, JAXBException, IOException, ParserConfigurationException, SAXException;
}
