import java.util.Arrays;
import java.util.stream.IntStream;

public class PracticeStreams {
    public static void main(String[] args) {
        //Sum of all nos from n to m divisible by 3 and 5
        int n =1, m=20;
        int sum = IntStream.rangeClosed(n,m)
                            .filter(x -> x%3==0 && x%5==0)
                            .sum();
        System.out.println("Sum of all nos divisible by 3 and 5: "+sum);

        int[] arr = {2,4,6,3,7,11};
        int k = 4;

        int sumOfGCD = Arrays.stream(arr)
                             .map(value -> gcd(value,k))
                             .sum();
        System.out.println(sumOfGCD);

    }

    static int gcd(int a, int b){
        return (a%b==0)? b: gcd(b, a%b);
    }
}
