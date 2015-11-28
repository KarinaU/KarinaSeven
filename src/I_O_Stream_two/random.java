package I_O_Stream_two;

import java.io.IOException;
import java.io.RandomAccessFile;
import static java.lang.System.out;

/**
 * Created by IT_School on 28.11.2015.
 */
public class random {
    public static final String sourceFileName = "D:\\sourse.txt";
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile(sourceFileName, "rw");

        out.println(raf.length());
            raf.seek(10);
        String s = raf.readLine();
            out.println(s);
            raf.seek(raf.length());
            raf.writeUTF("Привет");
            raf.close();

    }
}
