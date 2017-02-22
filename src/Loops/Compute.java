package Loops;

/**
 * Created by JPMC-PC11 on 20/02/2017.
 */
public class Compute {
    public static int computeSum(int num) {
        int sum=0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.print("["+i+"]");
        }
        return sum;
    }
    public static int computeFactorial(int num) {
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
            System.out.print("["+i+"]");
        }
        return fact;
    }
    /*public static String randNames(String name1, String name2, String name3) {
         for (String rand=)
        return randNames;
    }*/
}
