package J4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

/**
 * Created by carolchen on 29/07/2015.
 */
public class Doubles {
    public static void main(String[] args) {
        double x = 3.1;
        System.out.println("x: "+x);
        double y = 1.2345e-6;
        System.out.println("y: "+y);
        String s = "3.32";
        double z = Double.parseDouble(s);
        System.out.println("z: "+z);

        Random r = new Random();
        double w = r.nextDouble();
        System.out.println("random: "+w);

        System.out.println("not add, but string concatenation: "+3.0+5.0);
        /*operator*/
        System.out.println("add: "+(3.0+5.0));
        System.out.println("sub: "+(3.0-5.0));
        System.out.println("mul: "+(3.0*5.0));
        System.out.println("div: "+(3.0/5.0));
        System.out.println("remainder: "+(8.0%5.0));
        System.out.println("remainder: "+(-2.0%5.0));

        System.out.println("conv to int (floor): "+ ((int) 3.7));
        System.out.println("conv to int (ceil): "+(Math.round(3.7)));
        System.out.println("just double (floor): "+(Math.floor(3.7)));
        System.out.println("just double (ceil): "+Math.ceil(3.7));
        String q = String.format("%.2f", 3.123);
        System.out.println(q);

        System.out.println("max: "+Double.MAX_VALUE);
        System.out.println("min: "+Double.MIN_VALUE);
        System.out.println("size: "+Double.SIZE);
    }
}
