package J4;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Random;

/**
 * Created by carolchen on 29/07/2015.
 */
public class Integers {
    public static void main(String[] args) {
        int x = 123_234;
        System.out.println("x: "+x);
        int y = 0b11000011;
        System.out.println("y: "+y);
        String s = "234";
        int z = Integer.parseInt(s);
        System.out.println("z: "+z);

        Random r = new Random();
        int w = r.nextInt();
        System.out.println("random: "+w);

        System.out.println("not add, but string concatenation: "+3+5);
        /*operator*/
        System.out.println("add: "+(3+5));
        System.out.println("sub: "+(3-5));
        System.out.println("mul: "+(3*5));
        System.out.println("div: "+(3/5));
        System.out.println("remainder: "+(3%5));
        System.out.println("remainder: "+(-3%5));

        System.out.println("bit shift: "+(2121321>>5));
        System.out.println("bit shift: "+(2121321>>>5));
        System.out.println("bit shift: "+(-2121321>>5));
        System.out.println("bit shift: "+(-2121321>>>5));
        /*& and | are bitwise, while && and || are logical*/
        System.out.println("bit shift: "+(-2121321 & 5));
        System.out.println("bit shift: "+(2121321 | 5));

        System.out.println("cast to double: " + (double) 42);
        System.out.println("max: "+Integer.MAX_VALUE);
        System.out.println("min: "+Integer.MIN_VALUE);

        int sum = x + 5;
        System.out.println("add: "+sum);
        sum++;
        System.out.println("inc: "+sum);
        sum--;
        System.out.println("dec: "+sum);


    }
}
