package DataModel;

import java.util.Date;

public class Task extends Document {
    /**
     * dateissue-Дата выдачи поручения
     * executionperiod-Срок исполнения поручения
     * respperson-Ответственный испольнитель
     * ordercontroller-Контролер поручения
     * isundercontrol-Признак контрольности
     */
    private Date dateissue;
    private int executionperiod;
    private String respperson,ordercontroller;
    private boolean isundercontrol;


    public Task(int regnum,
                java.sql.Date docreg,
                int iddoc,
                String docname,
                String doctxt,
                Person authordoc,
                Date dateissue,
                int executionperiod,
                String respperson,
                String ordercontroller,
                boolean isundercontrol) throws Exception {
        super(regnum, docreg, iddoc, docname, doctxt, authordoc);
        this.dateissue=dateissue;
        this.executionperiod=executionperiod;
        this.respperson=respperson;
        this.ordercontroller=ordercontroller;
        this.isundercontrol=isundercontrol;
    }

    @Override
    public String toString() {
        return String.format("Поручение:\r\n  Дата выдачи поручения %s\r\n  %s",dateissue,showDoc());
    }
}
