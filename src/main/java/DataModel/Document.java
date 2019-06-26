package DataModel;

import java.sql.Date;

public abstract class Document implements Comparable <Document> {
    /**
     * IdDoc-идентификатор документов
     * RegNum-регистрационный номер
     * DocName-название документа
     * DocTxt-текст документа
     * AuthorDoc-автор документа
     * DocReg-дата регистрации документа
     */
    private int IdDoc, RegNum;
    private String DocName, DocTxt;
    private Person AuthorDoc;
    private Date DocReg;

        public Document(int RegNum,
                        Date DocReg,
                        int IdDoc,
                        String DocName,
                        String DocTxt,
                        Person AuthorDoc) throws Exception {
            if(RegNum <0)throw new NegativeRegnumDocException("RegNum не может быть меньше 0");
        this.DocReg = DocReg;
        this.RegNum = RegNum;
        this.IdDoc = IdDoc;
        this.DocName = DocName;
        this.DocTxt = DocTxt;
        this.AuthorDoc = AuthorDoc;
    }
    @Override
    public int compareTo(Document d){
    return (this.RegNum - d.RegNum);
}
    @Override
    public abstract String toString();

    /**
     * Показать документ
     * @return информация о документе
     */
    public String showDoc() {
        return String.format("document %d --- %s %d %s %s %s", RegNum, DocReg, IdDoc, DocName, DocTxt, AuthorDoc);
    }

    public int getIdDoc(){
        return IdDoc;
    }

    public Person getAuthorDoc(){
        return AuthorDoc;
    }

    public void setAuthorDoc(Person name){
        AuthorDoc =name;
    }
}
