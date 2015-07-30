package J4;

/**
 * Created by carolchen on 29/07/2015.
 */
public class Arrays {
    public static void main(String[] args) {
        /*array*/
        double d[];
        d = new double [5];
        d[0] = 1.0;
        d[4] = 3.1;
        System.out.println(d[1]);
        System.out.println(d[4]);
        int x = 7;
        int[] i = {2, x, 4, 5, 6, 9};
        System.out.println(i[1]);
        x = 10;
        /* because we put x in the array, so i[1] doesn't reference to x
        instead it reference what x were when it was put in the array */
        System.out.println(i[1]);
        System.out.println(x);

        /*2 demisions array*/
        double grid[][] = new double[2][];
        grid[0] = new double[2];
        grid[1] = new double[2];
        grid[0][0]=1;
        grid[1][0]=56;
        System.out.println(grid[0][0]);
        System.out.println(grid[1][0]);

    }
}
