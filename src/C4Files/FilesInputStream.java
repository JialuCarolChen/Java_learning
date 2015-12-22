package C4Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by carolchen on 13/11/2015.
 */
public class FilesInputStream {
    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            try {
                in = new FileInputStream("resources/words/hamlet.txt");
                for(int i = 0; i<100; i++) {
                    byte b = (byte) in.read();
                    System.out.write(b);
                }
                System.out.flush();

            }catch (FileNotFoundException e) {
                e.printStackTrace();

            }finally {
                if(in !=null) in.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
