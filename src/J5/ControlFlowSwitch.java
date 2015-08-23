package J5;

/**
 * Created by carolchen on 30/07/2015.
 */
public class ControlFlowSwitch {
    public static void main(String[] args) {
        int c = 4;
        switch (c) {
            case 1:
                System.out.println("c==1");
                break;
            /*if there is no break&this case match, it will print all all the next cases*/
            case 7:
                System.out.println("c==7");
                break;
                default:
                    System.out.println("c is neither, it is "+c);
        }
    }
}
