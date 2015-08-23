package J1;

import java.util.Scanner;

/**
 * Created by carolchen on 25/07/2015.
 */
public class IOTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer a:");
        int a = in.nextInt();
        System.out.println("Enter an integer b:");
        String b = in.next();
        System.out.println("a: "+a+", b: 7"+b);
        in.close();
    }
}
