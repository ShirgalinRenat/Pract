package DataModel;

import java.util.Date;

public class Incoming extends Document {
    /**
     * Sender-Отправитель
     * DestinationIn-Адресат
     * OutNumber-Исходящий номер
     * DateOutReg-Исходящая дата регистрации
     */
    private String Sender,DestinationIn;
    private String OutNumber;
    private Date DateOutReg;


    public Incoming(int RegNum,
                    java.sql.Date DocReg,
                    int IdDoc,
                    String DocName,
                    String DocTxt,
                    Person AuthorDoc,
                    String Sender,
                    String DestinationIn,
                    String OutNumber,
                    Date DateOutReg) throws Exception {
        super(RegNum, DocReg, IdDoc, DocName, DocTxt, AuthorDoc);
        this.Sender=Sender;
        this.DateOutReg=DateOutReg;
        this.OutNumber=OutNumber;
        this.DestinationIn=DestinationIn;
    }

    public Date getDateOutReg(){return DateOutReg;}

    @Override
    public String toString()
    {
        return String.format("Входящий:\r\n  Отправитель: %s \r\n  %s",Sender,showDoc());
    }
}
