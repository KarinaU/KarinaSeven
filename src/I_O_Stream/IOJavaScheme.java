package I_O_Stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IT_School on 22.11.2015.
 */
public class IOJavaScheme {
    public static void main(String[] args) {
        try{
            FileWriter out = new FileWriter("C:/Users/IT_School/IdeaProjects/KarinaSeven/src/Example.txt");
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);

            pw.println("I'm sentence");
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
