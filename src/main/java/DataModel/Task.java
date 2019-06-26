package DataModel;

import java.util.Date;

public class Task extends Document {
    /**
     * DateIssue-Дата выдачи поручения
     * ExecutionPeriod-Срок исполнения поручения
     * RespPerson-Ответственный испольнитель
     * OrderController-Контролер поручения
     * IsUnderControl-Признак контрольности
     */
    private Date DateIssue;
    private int ExecutionPeriod;
    private String RespPerson, OrderController;
    private boolean IsUnderControl;


    public Task(int RegNum,
                java.sql.Date DocReg,
                int IdDoc,
                String DocName,
                String DocTxt,
                Person AuthorDoc,
                Date DateIssue,
                int ExecutionPeriod,
                String RespPerson,
                String OrderController,
                boolean IsUnderControl) throws Exception {
        super(RegNum, DocReg, IdDoc, DocName, DocTxt, AuthorDoc);
        this.DateIssue =DateIssue;
        this.ExecutionPeriod =ExecutionPeriod;
        this.RespPerson = RespPerson;
        this.OrderController = OrderController;
        this.IsUnderControl = IsUnderControl;
    }

    @Override
    public String toString() {
        return String.format("Поручение:\r\n  Дата выдачи поручения %s\r\n  %s", DateIssue,showDoc());
    }
}
