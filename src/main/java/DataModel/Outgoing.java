package DataModel;

import java.sql.Date;

public class Outgoing extends Document {
    /**
     * destinationout-адресат
     * devmethod-способ доставки
     */
    private String destinationout,devmethod;


    public Outgoing(int regnum,
                    Date docreg,
                    int iddoc,
                    String docname,
                    String doctxt,
                    Person authordoc,
                    String destinationout,
                    String devmethod) throws Exception {
        super(regnum, docreg, iddoc, docname, doctxt, authordoc);
        this.destinationout=destinationout;
        this.devmethod=devmethod;
    }

    @Override
    public String toString() {
        return String.format("Исходящий:\r\n  Адресат:%s --- Способ доставки: %s \r\n  %s",destinationout,devmethod,showDoc());
    }
}
