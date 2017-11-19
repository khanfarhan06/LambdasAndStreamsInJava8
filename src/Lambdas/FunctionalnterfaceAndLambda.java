package Lambdas;

@FunctionalInterface
interface MyFunctionalInterface{
    public abstract void doIt();
}

public class FunctionalnterfaceAndLambda {
    public static void main(String[] args) {
        doWhatISay(() -> System.out.println("Write Out"));
    }

    private static void doWhatISay(MyFunctionalInterface myFunctionalInterface){
        myFunctionalInterface.doIt();
    }
}
