package J4;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Random;

/**
 * Created by carolchen on 29/07/2015.
 */
public class Strings {
    public static void main(String[] args) {
        String x = "Hello";
        System.out.println(x);
        String y = "world";
        System.out.println(y);
        System.out.println(x + " " + y + "!");

        String z = x + " " + y;
        System.out.println("Concatenation"+z);
        System.out.println("length: "+z.length());
        System.out.println("charAt: "+z.charAt(4));
        Random r = new Random();
        System.out.println("Random: "+z.charAt(r.nextInt(z.length())));
        System.out.println("Substring: "+z.substring(1, 4));
        System.out.println("equals: "+x.equals("hello"));
        System.out.println("equals: "+x.equals("Hello"));
        System.out.println("toLowerCase: "+x.toLowerCase());
        System.out.println("toLowerCase: "+x.toLowerCase().equals("hello"));
    }
}
