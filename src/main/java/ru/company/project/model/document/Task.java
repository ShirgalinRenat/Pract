package ru.company.project.model.document;

import ru.company.project.enums.DefinitionTypes;

import java.util.Date;

public class Task extends Document {
    /**
     * dateIssue-Дата выдачи поручения
     */
    @FieldDefinitionType(DefinitionTypes.DATE)
    private Date dateIssue;
    /**
     * executionData-Срок исполнения поручения
     */
    @FieldDefinitionType(DefinitionTypes.INTEGER)
    private int executionData;
    /**
     * respPerson-Ответственный испольнитель
     */
    @FieldDefinitionType(DefinitionTypes.HUMANNAME)
    private String respPerson;
    /**
     * orderController-Контролер поручения
     */
    @FieldDefinitionType(DefinitionTypes.HUMANNAME)
    private String orderController;
    /**
     * isUnderControl-Признак контрольности
     */
    @FieldDefinitionType(DefinitionTypes.BOOLEAN)
    private boolean isUnderControl;

    public Date getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(Date dateIssue) {
        this.dateIssue = dateIssue;
    }

    public int getExecutionData() {
        return executionData;
    }

    public void setExecutionData(int executionData) {
        this.executionData = executionData;
    }

    public String getRespPerson() {
        return respPerson;
    }

    public void setRespPerson(String respPerson) {
        this.respPerson = respPerson;
    }

    public String getOrderController() {
        return respPerson;
    }

    public void setOrderController(String orderController) {
        this.orderController = orderController;
    }

    @Override
    public String toString() {
        return "Поручение " + super.toString();
    }
}
