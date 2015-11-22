package I_O_Stream;

import java.io.*;
import static java.lang.System.*;

/**
 * Created by IT_School on 22.11.2015.
 */
public class laba_2 {
    public static final String sourceFileName = "C:/Users/IT_School/IdeaProjects/KarinaSeven/src/Example.txt";
    public static final String destFileName = "C:/Users/IT_School/IdeaProjects/KarinaSeven/src/dest.txt";

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
        PrintWriter write = new PrintWriter(destFileName);

        String s = null;
        int words = 0, lines = 0, chars = 0;
        while ((s=reader.readLine())!=null)
        {
            lines++;
            String[] ws=s.trim().split("\\s");
            words+=ws.length;
            for(String l : ws)
                chars += l.length();

            write.println(s.toUpperCase());
        }
        reader.close();
        write.close();
        out.printf("Кол-во символов - %d; слов-%d; строк-%d\n", chars, words, lines);
    }
}
