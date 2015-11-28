package I_O_Stream_two;

import java.io.*;
import java.io.IOException;

/**
 * Created by IT_School on 28.11.2015.
 */
public class DempSerialization {
    public static void main(String[] args) {
        Student goncharenko = new Student("MMMM", "goncharenko", 15, "gw69djn");

        System.out.println(goncharenko);

        File fw =  new File ("D:\\stud.txt");

        try{
            ObjectOutputStream outstream = new ObjectOutputStream(new FileOutputStream(fw));
            outstream.writeObject(goncharenko);
            outstream.close();

        } catch (IOException e) {
            System.err.println(e);
        }
        Student.faculty = "MEO";
        File fr = new File("D:\\stud.txt");

        try {
            ObjectOutputStream istream = new ObjectOutputStream(new FileOutputStream(fr));
            Student unknown = (Student)istream.readObject();
            istream.close();

            System.out.println(unknown);

        } catch (ClassNotFoundException me) {
            System.err.println(me);
            System.err.println("Класс не существует");

        } catch (FileNotFoundException fe) {
            System.err.println(fe);
            System.err.println("Файл не найден");

        } catch (IOException ve) {
            System.err.println(ve);
            System.err.println("Ошибка доступа");
        }
    }
    }

