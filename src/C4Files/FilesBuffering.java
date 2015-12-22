package C4Files;

import java.io.*;

/**
 * Created by carolchen on 13/11/2015.
 */
public class FilesBuffering {
    public static void main(String[] args) {

        for (int j = 0; j < 20; j++) {
            InputStream in = null;
            OutputStream out = null;

            long start = 0;//track time
            int count = 0;

            try {
                try {
                    if (false) {
                        in = new FileInputStream("resources/words/hamlet.txt");
                        out = new FileOutputStream("output.txt");
                    } else {
                        in = new BufferedInputStream(new FileInputStream("resources/words/hamlet.txt"), 1<<j);
                        out = new BufferedOutputStream(new FileOutputStream("output.txt"), 1<<j);
                    }


                    start = System.nanoTime();

                    int i;
                    while ((i = in.read()) != -1) {
                        out.write(i);
                        count++;
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();

                } finally {
                    in.close();
                    out.close();
                    System.out.println("That took " + (System.nanoTime() - start) / 1000000 + " msec to copy " + count + " bytes, with buffer size " +(1<<j));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
