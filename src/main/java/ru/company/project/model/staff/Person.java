package ru.company.project.model.staff;

import ru.company.project.enums.ClassTypes;
import ru.company.project.enums.DefinitionTypes;
import ru.company.project.model.document.FieldDefinitionType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Department")
@ClassType(ClassTypes.PERSON)
public class Person extends Staff {
    /**
     * name-Имя
     */
    @FieldDefinitionType(DefinitionTypes.TEXT)
    private String name;
    /**
     * surName-Фамилия
     */
    @FieldDefinitionType(DefinitionTypes.TEXT)
    private String surName;
    /**
     * patronymic-Отчество
     */
    @FieldDefinitionType(DefinitionTypes.TEXT)
    private String patronymic;
    /**
     * position-Должность
     */
    @FieldDefinitionType(DefinitionTypes.TEXT)
    private String position;

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    @XmlElement(name = "surName")
    public void setSurName(String surname) {
        this.surName = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @XmlElement(name = "patronymic")
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    @XmlElement(name = "position")
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        //return fullName+shortName+boss+phoneNumber+super.toString();
        return "\r\n Person [name=" + name + ", patronymic=" + patronymic + ", position=" + position + ", surName=" + surName + "]";
    }
}
