package C4Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by carolchen on 13/11/2015.
 */
public class FileCopy {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        long start = 0; // track time
        int count = 0; // track bytes

        try {
            try {
                in = new FileInputStream("resources/words/hamlet.txt");
                out = new FileOutputStream("output.txt");

                start = System.nanoTime();
                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                    count++;
                }
            }catch (FileNotFoundException e) {
                e.printStackTrace();

            }finally {
                in.close();
                out.close();
                System.out.println("That took " + (System.nanoTime() - start) / 1000000 + " msec to copy " + count + " bytes");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
