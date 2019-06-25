package DataModel;


import java.util.Comparator;

public class DocumentByNameComparator implements Comparator<Document> {
    @Override
    public int compare(Document o1, Document o2) {
        return o1.getAuthordoc().compareTo(o2.getAuthordoc());
    }
}
