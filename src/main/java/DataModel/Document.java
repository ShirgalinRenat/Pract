package DataModel;

import java.io.Serializable;
import java.sql.Date;

public abstract class Document implements Comparable <Document> {
    /**
     * iddoc-идентификатор документов
     * regnum-регистрационный номер
     * docname-название документа
     * doctxt-текст документа
     * authordoc-автор документа
     * docreg-дата регистрации документа
     */
    private int iddoc,regnum;
    private String docname,doctxt;
    private Person authordoc;
    private Date docreg;

        public Document(int regnum,
                        Date docreg,
                        int iddoc,
                        String docname,
                        String doctxt,
                        Person authordoc) throws Exception {
            if(regnum<0)throw new NegativeRegnumDocException("regnum не может быть меньше 0");
        this.docreg=docreg;
        this.regnum=regnum;
        this.iddoc=iddoc;
        this.docname=docname;
        this.doctxt=doctxt;
        this.authordoc=authordoc;
    }

    @Override
    public int compareTo(Document d){
    return (this.regnum - d.regnum);
}
    @Override
    public abstract String toString();

    /**
     * Показать документ
     * @return информация о документе
     */
    public String showDoc() {
        return String.format("document %d --- %s %d %s %s %s",regnum,docreg,iddoc,docname,doctxt,authordoc);
    }

    public int getIdDoc(){
        return iddoc;
    }

    public Person getAuthordoc(){
        return authordoc;
    }

    public void setAuthordoc(Person name){
        authordoc=name;
    }
}
