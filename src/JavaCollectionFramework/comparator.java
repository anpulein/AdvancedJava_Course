package JavaCollectionFramework;

import javax.annotation.processing.Completion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Frog");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return 1;
                } else if(o1 < o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);


        List<Person1> people = new ArrayList<>();
        people.add(new Person1(2, "Bob"));
        people.add(new Person1(3, "Katy"));
        people.add(new Person1(1, "Mike"));

        Collections.sort(people, new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                if(o1.getId() > o2.getId()) {
                    return 1;
                } else if(o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(people);
    }


}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2) {
            return 1;
        } else if(o1 < o2) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Person1 {
    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}