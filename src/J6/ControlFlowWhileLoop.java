package J6;

/**
 * Created by carolchen on 30/07/2015.
 */
public class ControlFlowWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("while i is: "+i);
            if (i==2) {
                break;
                /*try to change it to "continue;",what happen?*/
                /*try put i++; before continue;*/
            }
            i++;
        }

        for (i = 0;i < 5;i++) {
            if (i==2) continue;
            System.out.println("while i is(ecept 2): "+i);

        }
/*compare the difference between do-while and while*/
        i = 10;
        do {
            System.out.println("do-while i is: "+i);
        } while (i < 5);
    }
}
