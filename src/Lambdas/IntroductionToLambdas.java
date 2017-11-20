package Lambdas;

/***
 * Before Java 8, we used anonymous classes to create threads as show in the first example in the code.
 * But in Java 8, we can replace these anonymous classes with Lambda expressions.
 * To use a lambda expression we must have a Functional Interface corresponding to the lambda expression provided.
 * This makes the code less noisy, more readable and uses less strokes for typing.
 */
public class IntroductionToLambdas {
    public static void main(String[] args) {
        //Before Java 8, we create anonymous class which implemented the Runnable interface
        //Then we override the run() method to work according to our given logic
        Thread oldThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is the old way");
            }
        });
        oldThread.start();

        /***
         * Using Lambdas in Java 8, we just provide the lamda expression which represents what we want to do
           Points to Note: 1. Runnable is a Functional Interface
                           2. run() method takes no arguments, so does the lambda
                           3. run() method does not return any value, so does the lambda
         */
        Thread newThread = new Thread(() -> System.out.println("This is the Java 8 way"));
        newThread.start();
    }
}
