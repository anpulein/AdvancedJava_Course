package JavaCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class QUEUE {
  public static void main(String[] args) {

    Person_2 person1 = new Person_2(1);
    Person_2 person2 = new Person_2(2);
    Person_2 person3 = new Person_2(3);
    Person_2 person4 = new Person_2(4);

    Queue<Person_2> people = new ArrayBlockingQueue<Person_2>(10);
    people.add(person3);
    people.add(person2);
    people.add(person4);
    people.add(person1);

    System.out.println(people.peek()); // Смотрит элемент в очереди, но не удаляет
    System.out.println(people.remove());
    for (Person_2 person_2: people) {
      System.out.println(person_2);
    }

  }
}

class Person_2 {
    private int id;

    public Person_2(int id) {
      this.id = id;
   }

  @Override
  public String toString() {
    return "Person_2{" +
            "id=" + id +
            '}';
  }
}
