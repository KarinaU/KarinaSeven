package I_O_Stream_two;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Created by IT_School on 28.11.2015.
 */
public class InputStreamWriteExample {
    public static void main(String[] args)throws Exception{
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\sourse1.txt"),"UTF8"));
        out.write("asdf");
        out.close();

        System.err.println("Пример: ошибка");
    }
}
