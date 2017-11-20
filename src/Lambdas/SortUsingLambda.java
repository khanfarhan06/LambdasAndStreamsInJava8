package Lambdas;

import java.util.*;

public class SortUsingLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Farhan",23,'m'));
        people.add(new Person("Nityansh",22,'m'));
        people.add(new Person("Mukulika",21,'f'));
        people.add(new Person("Prabuddh",23,'m'));
        people.add(new Person("Kislay",24,'m'));

        //Older way to sort a Collection
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //Sort according to lexicographic order of names
        Collections.sort(people,(Person a,Person b) ->  a.getName().compareTo(b.getName()));
        System.out.println("Sorted according to name lexicographically");
        people.stream().forEach(System.out::println);

        //Sort according to length of names
        Collections.sort(people, (a,b) -> Integer.compare(a.getName().length(), b.getName().length()));
        System.out.println("Sorted according to name length");
        people.stream().forEach(System.out::println);

        //Sort according to age
        people.sort( (a,b) -> Integer.compare(a.getAge(), b.getAge()));
        System.out.println("Sorted according to age");
        people.stream().forEach(System.out::println);
    }
}
