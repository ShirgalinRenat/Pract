package ru.company.project.utils;

import ru.company.project.exceptions.DocumentExistsException;
import ru.company.project.factory.staff.OrganizationFactory;
import ru.company.project.factory.staff.StaffObtainable;
import ru.company.project.model.staff.Department;
import ru.company.project.model.staff.Organization;
import ru.company.project.model.staff.Staff;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import static javax.xml.bind.JAXBContext.newInstance;

public class JAXBMarshaller implements StaffObtainable {
    private String fileName;

   public JAXBMarshaller(String fileName){
        this.fileName=fileName;
    }
    @Override
    public void staffObtain(Staff staff) throws IllegalAccessException, JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Department.class);
        staff = (Staff) context.createUnmarshaller()
                .unmarshal(new FileReader(fileName));
        //учетка памяти
        //сделать враппер для Staff
    }
}

        /*JAXBContext context1 = newInstance(Staff.class);
        Marshaller mar1 = context1.createMarshaller();
        mar1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar1.marshal(staff, new File("./src/main/resources/Organization.xml"));*/