package J6;

import java.util.Random;

/**
 * Created by carolchen on 30/07/2015.
 */
public class ControlFlowForLoop {
    public static void main(String[] args) {
        int i;
        for (i=0; i < 4; i++) {
            System.out.println("i is: "+i);
        }
        System.out.println("i is: "+i);

        int a[] = { 3, 6, 13, 2, 12};
        for (i=0; i<a.length; i++) {
            System.out.println("a["+i+"] is "+a[i]);
        }
        for (int v : a) {
            System.out.println("next value is"+v);
        }

        int array[] = new int[5];
        Random generator = new Random();
        for (i=0; i<10; i++) {
            array[i] = generator.nextInt(50);
            System.out.println("random array["+i+"] is "+array[i]);
        }

    }
}
