package Lambdas;

/***
 * This example shows how we can create our own functional interface to use lambdas
 * Most of the time you will be using Functional Interfaces provided by java because they have covered almost all that you need under the pakage java.utils.Functions
 * Functional Interface: It is an interface that has just one method and that method is abstract
 *                       It can have default and static methods, but multiple abstract methods are not allowed
 */

@FunctionalInterface
interface MyFunctionalInterface{
    //the only abstract method
    public abstract void doIt();

    //static methods are allowed
    public static void aStaticMethod(){
        //any implementation as required
    }

    //default methods are also allowed
    default void toInt() {
        //any implementation as required
    }
}

public class FunctionalnterfaceAndLambda {
    public static void main(String[] args) {
        //Passing a lambda to doWhatISay which follows the contract of doIt() of MyFunctionalInterface
        doWhatISay(() -> System.out.println("Write Out"));
    }

    //method which takes MyFunctionalInterface as a parameter, this is what allows us to use a lambda
    private static void doWhatISay(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.doIt();
    }
}
