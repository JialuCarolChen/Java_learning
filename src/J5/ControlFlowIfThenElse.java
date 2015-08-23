package J5;

/**
 * Created by carolchen on 30/07/2015.
 */
public class ControlFlowIfThenElse {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;

        if (a && b) {
            System.out.println("Both a and b are true!");
        } else {
            System.out.println("at least one of a and b is false!");
        }

        if (a) {
            if (b) {
                System.out.println("Both a and b are true!");
            } else {
                System.out.println("a is true and b is false");
            }
        } else {
            System.out.println("Both a and b are false!");
        }
    }
}
