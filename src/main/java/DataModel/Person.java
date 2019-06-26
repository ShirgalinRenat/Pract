package DataModel;

public class Person implements Comparable<Person> {
    String name;
    public Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.toString());
    }
}
