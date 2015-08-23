package J10NumberAutoboxing;

/**
 * Created by carolchen on 24/08/2015.
 */
public class Boxing {
    public static void main(String[] args) {
        Integer a = new Integer(6);
        Integer b = 6; // autoboxing
        int c = a; // auto un-boxing
        int d = new Integer(6); // gratuitous auto unboxing


        //but a and b are not the same object
        // they have same value but not from the same box!!!!
        if(a == b)
        {System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }
        if(a.equals(b))
        {System.out.println("a equals b");
        } else {
            System.out.println("a not equals b");
        }

        //c auto unbox a, so c and a are same object
        if(c == a)
        {System.out.println("a == c");
        } else {
            System.out.println("a != c");
        }



    }
}
