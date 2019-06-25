package Factory;
//hello
import DataModel.Document;
import DataModel.DocumentByNameComparator;
import DataModel.Person;

import java.io.FileWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Document> list = new ArrayList<>();
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван Алексеевич"));
        people.add(new Person("Михаил Юрьевич"));
        people.add(new Person("Эдуард Евгеньевич"));
        people.add(new Person("Владислав Аркадьевич"));
        people.add(new Person("Артем Викторович"));
        OutgoingCreator outcreator = new OutgoingCreator(list,people);
        IncomingCreator increator=new IncomingCreator(list,people);
        TaskCreator taskcreator=new TaskCreator(list,people);
        outcreator.createandadd();
        outcreator.createandadd();
        increator.createandadd();
        increator.createandadd();

        Collections.sort(list,new DocumentByNameComparator());
        FileWriter filewriter=new FileWriter("output.txt",true);
        for (Document item:list) {
            filewriter.write(item.toString()+"\r\n");
            filewriter.flush();
            System.out.println(String.format("%s",item));
        }
        filewriter.close();
    }

}
