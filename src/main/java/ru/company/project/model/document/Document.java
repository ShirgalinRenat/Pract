package ru.company.project.model.document;

import ru.company.project.enums.DefinitionTypes;

import java.util.Date;

public abstract class Document implements Comparable<Document> {
    /**
     * id-идентификатор документов
     */
    @RandomValue(DefinitionTypes.INTEGER)
    private int id;
    /**
     * docName-название документа
     */
    @RandomValue(DefinitionTypes.NAME)
    private String docName;
    /**
     * docTxt-текст документа
     */
    @RandomValue(DefinitionTypes.TEXT)
    private String docTxt;
    /**
     * regNum-регистрационный номер
     */
    @RandomValue(DefinitionTypes.REGNUM)
    private String regNum;
    /**
     * authorDoc-автор документа
     */
    @RandomValue(DefinitionTypes.HUMANNAME)
    private String authorDoc;
    /**
     * docReg-дата регистрации документа
     */
    @RandomValue(DefinitionTypes.DATE)
    private Date docReg;

    @Override
    public int compareTo(Document document) {
        return this.regNum.compareTo(document.regNum);
    }

    /**
     * Строка для вывода данных
     *
     * @return информация о документе
     */
    @Override
    public String toString() {
        return "№" + regNum + " от " + docReg + "." + " Название:" + docName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocTxt() {
        return docTxt;
    }

    public void setDocTxt(String docTxt) {
        this.docTxt = docTxt;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getAuthorDoc() {
        return authorDoc;
    }

    public void setAuthorDoc(String authorDoc) {
        this.authorDoc = authorDoc;
    }

    public Date getDocReg() {
        return docReg;
    }

    public void setDocReg(Date docReg) {
        this.docReg = docReg;
    }
}
