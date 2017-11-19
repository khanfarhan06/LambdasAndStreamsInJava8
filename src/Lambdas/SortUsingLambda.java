package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortUsingLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Farhan",23,'m'));
        people.add(new Person("Nityansh",22,'m'));
        people.add(new Person("Mukulika",21,'f'));
        people.add(new Person("Prabuddh",23,'m'));
        people.add(new Person("Kislay",24,'m'));

        //Sort according to lexicographic order of names
        Collections.sort(people,(Person a,Person b) ->  a.getName().compareTo(b.getName()));

        //Sort according to length of names
        Collections.sort(people, (a,b) -> Integer.compare(a.getName().length(), b.getName().length()));

        //Sort according to age
        people.sort( (a,b) -> Integer.compare(a.getAge(), b.getAge()));

        Iterator<Person> personIterator = people.iterator();
        while (personIterator.hasNext())
            System.out.println(personIterator.next());
    }
}
