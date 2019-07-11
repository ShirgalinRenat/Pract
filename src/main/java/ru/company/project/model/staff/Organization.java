package ru.company.project.model.staff;

import ru.company.project.enums.ClassTypes;
import ru.company.project.enums.DefinitionTypes;
import ru.company.project.model.document.FieldDefinitionType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Organization")
@ClassType(ClassTypes.ORGANIZATION)
public class Organization extends Staff {
    /**
     * fullName-Полное наименование
     */
    @FieldDefinitionType(DefinitionTypes.HUMANNAME)
    private String fullName;
    /**
     * shortName-Краткое наименование
     */
    @FieldDefinitionType(DefinitionTypes.TEXT)
    private String shortName;
    /**
     * boss-Руководитель
     */
    @FieldDefinitionType(DefinitionTypes.HUMANNAME)
    private String boss;
    /**
     * phoneNumber-Контактные телефоны
     */
    @FieldDefinitionType(DefinitionTypes.NUMBER)
    private String phoneNumber;

    public String getFullName() {
        return fullName;
    }

    @XmlElement(name = "fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    @XmlElement(name = "shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getBoss() {
        return boss;
    }

    @XmlElement(name = "boss")
    public void setBoss(String boss) {
        this.boss = boss;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @XmlElement(name = "phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        //return fullName+shortName+boss+phoneNumber+super.toString();
        return "\r\n Organization [fullName=" + fullName + ", shortName=" + shortName + ", boss=" + boss + ", phoneNumber=" + phoneNumber + "]";
    }

}
