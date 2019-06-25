package Factory;

import DataModel.Document;
import DataModel.Incoming;
import DataModel.Person;

import java.sql.Date;
import java.util.List;

public class IncomingCreator extends DocumentCreator {
    public IncomingCreator(List<Document> documentList, List<Person> people) {
        super(documentList,people);
    }

    @Override
    protected Document create() throws Exception {
        generate();
        return new Incoming(regnum,
                docreg,
                iddoc,
                docname,
                doctxt,
                authordoc,
                "Дубрай",
                "Ул Кирова дом 5",
                "89652591463",
                new Date(119,3,18));
    }

}
