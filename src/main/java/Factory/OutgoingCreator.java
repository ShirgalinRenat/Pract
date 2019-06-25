package Factory;

import DataModel.Document;
import DataModel.Outgoing;
import DataModel.Person;

import java.util.List;

public class OutgoingCreator extends DocumentCreator {
    public OutgoingCreator(List<Document> documentList, List<Person> people) {
        super(documentList,people);
    }

    @Override
    protected Document create() throws Exception {
        generate();
        return new Outgoing(regnum,
                docreg,
                iddoc,
                docname,
                doctxt,
                authordoc,
                "Ул Пушкина дом 5",
                "Почта России");
    }

}
