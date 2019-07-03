package ru.company.project.datamodel;

import ru.company.project.enums.DefinitionTypes;

import java.util.Date;

public class Task extends Document {
    /**
     * dateIssue-Дата выдачи поручения
     */
    @RandomValue(DefinitionTypes.DATE)
    private Date dateIssue;
    /**
     * executionPeriod-Срок исполнения поручения
     */
    @RandomValue(DefinitionTypes.INTEGER)
    private int executionPeriod;
    /**
     * respPerson-Ответственный испольнитель
     */
    @RandomValue(DefinitionTypes.HUMANNAME)
    private String respPerson;
    /**
     * orderController-Контролер поручения
     */
    @RandomValue(DefinitionTypes.HUMANNAME)
    private String orderController;
    /**
     * isUnderControl-Признак контрольности
     */
    @RandomValue(DefinitionTypes.BOOLEAN)
    private boolean isUnderControl;

    public Date getDateIssue(){
        return dateIssue;
    }

    public void setDateIssue(Date dateIssue){
        this.dateIssue=dateIssue;
    }

    public int getExecutionPeriod(){
        return executionPeriod;
    }

    public void setExecutionPeriod(int executionPeriod){
        this.executionPeriod=executionPeriod;
    }

    public String getRespPerson(){
        return respPerson;
    }

    public void setRespPerson(String respPerson){
        this.respPerson=respPerson;
    }

    public String getOrderController(){
        return respPerson;
    }

    public void setOrderController(String orderController){
        this.orderController=orderController;
    }

    @Override
    public String toString() {
        return getAuthorDoc()+":\r\n"+"\r Поручение "+super.toString();
    }
}
