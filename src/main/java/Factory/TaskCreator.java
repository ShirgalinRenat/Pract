package Factory;

import DataModel.Document;
import DataModel.Person;
import DataModel.Task;

import java.sql.Date;
import java.util.List;


public class TaskCreator extends DocumentCreator {

    public TaskCreator(List<Document> documentList, List<Person> people) {
        super(documentList,people);
    }

    @Override
    protected Document create() throws Exception {
        generate();
        return new Task(regnum,
                docreg,
                iddoc,
                docname,
                doctxt,
                authordoc,
                new Date(118,2,4),
                20,
                "Миша",
                "Александр",
                true);
    }

}
