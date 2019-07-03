package ru.company.project.datamodel;

import ru.company.project.enums.DefinitionTypes;

public class Outgoing extends Document {
    /**
     * destinationOut-адресат
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String destinationOut;
    /**
     * devMethod-способ доставки
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String devMethod;

    public String getDestinationOut(){
        return destinationOut;
    }

    public void setDestinationOut(String destinationOut){
        this.destinationOut=destinationOut;
    }

    public String getDevMethod(){
        return devMethod;
    }

    public void setDevMethod(String devMethod){
        this.devMethod=devMethod;
    }

    @Override
    public String toString() { return getAuthorDoc()+":\r\n"+"\r Исходящий "+super.toString();
    }
}
