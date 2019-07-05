package ru.company.project.staff;

import ru.company.project.datamodel.RandomValue;
import ru.company.project.enums.DefinitionTypes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Department extends Staff {
    /**
     * fullName-Полное наименование
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String fullName;
    /**
     * shortName-Краткое наименование
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String shortName;
    /**
     * boss-Руководитель
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String boss;
    /**
     * phoneNumber-Контактные телефоны
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String phoneNumber;

    public Department(StaffGenerator data) {
        super(data);
    }

    public Department() {
        super();
    }

    public String getFullName(){
        return fullName;
    }

    @XmlElement
    public void setFullName(String fullName){

        this.fullName =fullName;
    }

    public String getShortName(){

        return shortName;
    }

    @XmlElement
    public void setShortName(String shortName){

        this.shortName =shortName;
    }

    public String getBoss(){

        return boss;
    }

    @XmlElement
    public void setBoss(String boss){

        this.boss =boss;
    }

    public String getPhoneNumber(){

        return phoneNumber;
    }

    @XmlElement
    public void setPhoneNumber(String phoneNumber){

        this.phoneNumber = phoneNumber;
    }
    @Override
    public Staff create() throws IllegalAccessException {
        Department dpt= new Department();
        getObtainer().staffObtain(dpt);
        return dpt;
    }

}
