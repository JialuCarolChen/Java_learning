package J7;

/**
 * Created by carolchen on 30/07/2015.
 */
public class Methods {
    static void boo(int x) {
        System.out.println("Boo!");
        x = 8;
        System.out.println("their x: "+x);
    }


    public static void main(String[] args) {
        int x = 3;
        boo(x);
        System.out.println("my x: "+x);
    }
}
