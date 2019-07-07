package ru.company.project.model.staff;

import ru.company.project.enums.DefinitionTypes;
import ru.company.project.model.document.RandomValue;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Person extends Staff {
    /**
     * name-Имя
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String name;
    /**
     * surName-Фамилия
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String surName;
    /**
     * patronymic-Отчество
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String patronymic;
    /**
     * position-Должность
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String position;

    public String getName(){
        return name;
    }

    @XmlElement
    public void setName(String name){
        this.name=name;
    }

    public String getSurName(){
        return surName;
    }

    @XmlElement
    public void setSurName(String surname){
        this.surName =surname;
    }

    public String getPatronymic(){
        return patronymic;
    }

    @XmlElement
    public void setPatronymic(String patronymic){
        this.patronymic=patronymic;
    }

    public String getPosition(){
        return  position;
    }

    @XmlElement
    public void setPosition(String position){
        this.position=position;
    }

}
