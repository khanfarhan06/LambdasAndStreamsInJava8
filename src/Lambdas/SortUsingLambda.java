package Lambdas;

import java.util.*;

/***
 * This example shows how we can sort a Collection using lambdas.
 * Comparator is a functional interface in Java so we can use lambdas instead of creating anonymous class
 * I have also included the use of forEach() which has been introduced in the Collections framework
 */

public class SortUsingLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Farhan",23,'m'));
        people.add(new Person("Nityansh",22,'m'));
        people.add(new Person("Mukulika",21,'f'));
        people.add(new Person("Prabuddh",23,'m'));
        people.add(new Person("Kislay",24,'m'));

        //Older way to sort a Collection using Collection.sort() and passing an object of anonymous class to it
        //Here we are sorting according to the lexicographical order of names
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //Sort according to lexicographic order of names in Java 8
        //We just pass a lambda instead of creating an anonymous class
        Collections.sort(people,(Person a,Person b) ->  a.getName().compareTo(b.getName()));
        System.out.println("Sorted according to name lexicographically");

        //Printing all the elements of the Collection using forEach()
        //System.out::println is a method reference
        people.forEach(System.out::println);

        //Sort according to length of names
        Collections.sort(people, (a,b) -> Integer.compare(a.getName().length(), b.getName().length()));
        System.out.println("Sorted according to name length");
        people.forEach(System.out::println);

        //Sort according to age
        people.sort( (a,b) -> Integer.compare(a.getAge(), b.getAge()));
        System.out.println("Sorted according to age");
        people.forEach(System.out::println);
    }
}
