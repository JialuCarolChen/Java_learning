package J9Lambda;

import java.util.function.IntPredicate;

/**
 * Created by carolchen on 8/08/2015.
 */
public class Lambda {
    static void printBig(int value, IntPredicate bigTest) {
        if(bigTest.test(value)) {
            System.out.println("Yes, " +value+" it's big");
        } else {
            System.out.println("No, not really");
        }
    }


    public static void main(String[] args) {
        printBig(200, x -> x>1000);
        printBig(200, x -> x>100);
        IntPredicate bt = x -> x>100;
        printBig(10, bt);
        printBig(101, bt);
    }
}
