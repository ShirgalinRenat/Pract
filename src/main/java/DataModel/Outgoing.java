package DataModel;

import java.sql.Date;

public class Outgoing extends Document {
    /**
     * DestinationOut-адресат
     * DevMethod-способ доставки
     */
    private String DestinationOut,DevMethod;


    public Outgoing(int RegNum,
                    Date DocReg,
                    int IdDoc,
                    String DocName,
                    String DocTxt,
                    Person AuthorDoc,
                    String DestinationOut,
                    String DevMethod) throws Exception {
        super(RegNum, DocReg, IdDoc, DocName, DocTxt, AuthorDoc);
        this.DestinationOut=DestinationOut;
        this.DevMethod=DevMethod;
    }

    @Override
    public String toString() {
        return String.format("Исходящий:\r\n  Адресат:%s --- Способ доставки: %s \r\n  %s",DestinationOut,DevMethod,showDoc());
    }
}
