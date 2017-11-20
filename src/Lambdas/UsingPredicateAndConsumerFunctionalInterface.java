package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsingPredicateAndConsumerFunctionalInterface {

    private static List<Person> filterList(List<Person> list, Predicate<Person> personPredicate){
        List<Person> filteredList = new ArrayList<>();

        for(Person person : list){
            if(personPredicate.test(person))
                filteredList.add(person);
        }

        return filteredList;
    }

    private static void filterAndExecute(List<Person> list, Predicate<Person> personPredicate, Consumer<Person> personConsumer){
        for(Person person : list){
            if(personPredicate.test(person))
                personConsumer.accept(person);
        }
    }

    private static void execute(List<Person> list, Consumer<Person> personConsumer){
        for(Person person: list)
            personConsumer.accept(person);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Farhan",23,'m'));
        people.add(new Person("Nityansh",22,'m'));
        people.add(new Person("Mukulika",21,'f'));
        people.add(new Person("Prabuddh",23,'m'));
        people.add(new Person("Kislay",24,'m'));

        //Filter the list to have only male person
        List<Person> onlyMaleList = filterList(people, (person) -> person.getGender()=='m');

        //Print all person objects in the list
        execute(people, person -> System.out.println(person));
                            //OR
        //execute(people, System.out::println); using method references


        //Print name of all people with age > 22
        filterAndExecute(people, (person -> person.getAge()>22), (person -> System.out.println(person.getName())));

    }
}
