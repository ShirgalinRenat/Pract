package DataModel;

import java.util.Date;

public class Incoming extends Document {
    /**
     * sender-Отправитель
     * destinationin-Адресат
     * outnumber-Исходящий номер
     * dateoutreg-Исходящая дата регистрации
     */
    private String sender,destinationin;
    private String outnumber;
    private Date dateoutreg;


    public Incoming(int regnum,
                    java.sql.Date docreg,
                    int iddoc,
                    String docname,
                    String doctxt,
                    Person authordoc,
                    String sender,
                    String destinationin,
                    String outnumber,
                    Date dateoutreg) throws Exception {
        super(regnum, docreg, iddoc, docname, doctxt, authordoc);
        this.sender=sender;
        this.dateoutreg=dateoutreg;
        this.outnumber=outnumber;
        this.destinationin=destinationin;
    }


    @Override
    public String toString()
    {
        return String.format("Входящий:\r\n  Отправитель: %s \r\n  %s",sender,showDoc());
    }
}
