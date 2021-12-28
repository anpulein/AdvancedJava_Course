package JavaCollectionFramework;

import java.text.CollationElementIterator;
import java.util.*;

public class comparable {
    public static void main(String[] args) {
        List<Person_1> peopleList = new ArrayList<>();
        Set<Person_1> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Person_1(1, "Bob"));
        collection.add(new Person_1(4, "Georgy"));
        collection.add(new Person_1(3, "Katy"));
        collection.add(new Person_1(2, "Tom"));
    }
}


class Person_1 implements Comparable<Person_1>{
    private int id;
    private String name;

    public Person_1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person_1 person_1 = (Person_1) o;

        if (id != person_1.id) return false;
        return name != null ? name.equals(person_1.name) : person_1.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Person_1 o) {
        if(this.name.length() > o.getName().length()) {
            return 1;
        } else if(this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person_1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}