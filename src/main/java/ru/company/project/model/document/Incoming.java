package ru.company.project.model.document;

import ru.company.project.enums.DefinitionTypes;

import java.util.Date;

public class Incoming extends Document {
    /**
     * sender-Отправитель
     */
    @RandomValue(DefinitionTypes.NAME)
    private String sender;
    /**
     * destinationIn-Адресат
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String destinationIn;
    /**
     * outNumber-Исходящий номер
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String outNumber;
    /**
     * dateOutReg-Исходящая дата регистрации
     */
    @RandomValue(DefinitionTypes.DATE)
    private Date dateOutReg;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getDestinationIn() {
        return destinationIn;
    }

    public void setDestinationIn(String destinationIn) {
        this.destinationIn = destinationIn;
    }

    public String getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(String outNumber) {
        this.outNumber = outNumber;
    }

    public Date getDateOutReg() {
        return dateOutReg;
    }

    public void setDateOutReg(Date dateOutReg) {
        this.dateOutReg = dateOutReg;
    }

    @Override
    public String toString() {
        return "Входящий " + super.toString();
    }
}
