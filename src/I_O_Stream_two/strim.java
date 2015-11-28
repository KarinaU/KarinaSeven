package I_O_Stream_two;

import java.io.*;
import static java.lang.System.out;

/**
 * Created by IT_School on 28.11.2015.
 */
public class strim {

    public static void main(String[] args) throws IOException {
        FileInputStream st = new FileInputStream("D:\\test.txt");

        out.print("\n__Работа с потоками, читаем побайтово__\n");
        while (st.available()!=0)//пока нет конца файла читаем по символам
        {
            int b=st.read();
            char ch=(char)b;
            out.print(ch);
        }st.close();

        FileOutputStream so = new FileOutputStream("D:\\out.txt");
        String d = "Привет";
        byte [] bytes = d.getBytes();
        so.write(bytes);
        so.close();

        BufferedReader reader = new BufferedReader(new FileReader("D:\\test.txt"));
        String s = null;
        out.print("Работа с  BufferedReader, читаем по cтрокам");

        while ((s=reader.readLine())!=null){
            out.println(s);
        }
            reader.close();

        PrintWriter write = new PrintWriter("D:\\out1.txt");
        write.printf("%s %d %c", "Строка",100,'ё');
        write.close();
    }
}
