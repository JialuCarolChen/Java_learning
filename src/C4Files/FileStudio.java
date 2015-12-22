package C4Files;

import java.io.IOException;

/**
 * Created by carolchen on 13/11/2015.
 */
public class FileStudio {
    public static void main(String[] args) {
        try{
            byte b = (byte) System.in.read();
            System.out.println(b);//since it says print out a new line, it directly flush the buffer
            System.out.write(b);//need to flush the buffer
            System.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
