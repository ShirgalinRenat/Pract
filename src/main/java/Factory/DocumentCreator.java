package Factory;

import DataModel.Document;
import DataModel.Person;

import java.sql.Date;
import java.util.List;

public abstract class DocumentCreator {
    List<Person> personList;
    int IdDoc, RegNum;
    String DocName, DocTxt;
    Person AuthorDoc;
    Date DocReg;
    public List<Document> documentList;
    public DocumentCreator(List<Document> documentList, List<Person> personList){
        this.personList=personList;
        this.documentList=documentList;
    }

    public DocumentCreator(List<Document> documentList) {
    }

    abstract protected Document create() throws Exception;
    public void CreateAndAdd() throws Exception{
        Document doc = create();
        if(documentList.stream().anyMatch(item->item.getIdDoc()==doc.getIdDoc()))
            throw new DocumentExistsException("Документ с таким id уже существует");
        documentList.add(doc);
    }

    public void generate(){
        AuthorDoc = personList.get(getRandomNumberInRange(0,personList.size()-1));
        IdDoc = getRandomNumberInRange(0,100);
        RegNum = getRandomNumberInRange(0,100);
        DocName = "Название"+String.valueOf(getRandomNumberInRange(0,100));
        DocTxt = "Текст"+String.valueOf(getRandomNumberInRange(0,100));
        DocReg = new Date((long)(Math.random() * new Long("978988888889")));

    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("максильмальное значение должно быть больше минимального");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }


}
