package J15Exceptions;

import java.util.Date;

/**
 * Created by carolchen on 11/11/2015.
 */
public class Exceptions {

    private static void exceptionalMethod() {
        System.out.println("Start of Method");//print with the error message
        Date d = null;//new Date
        try{
            //d.toString();//null pointer exception
            int i = 7 / 0;//by Zero exception
        } catch(ArithmeticException ae) {
            System.out.println("Handling an arithmetic exception: " + ae);
            throw ae;//re-throw an exception to it's caller(the main method)

        } catch (Exception e) {
            System.out.println("Handling a general exception");
            e.printStackTrace();
        } finally {
            System.out.println("In finally clause");
        }
        System.out.println("End of Method");
    }



    public static void main(String[] args) {
        try {
            exceptionalMethod();
        } catch (Exception e) {
            System.out.println("Caught it in main()!!");
        }
        System.out.println("End of Program");
    }
}
