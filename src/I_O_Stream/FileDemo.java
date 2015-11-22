package I_O_Stream;

import java.io.File;
/**
 * Created by IT_School on 22.11.2015.
 */
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main (String args []){
        File f1 = new File ("C:/Users/IT_School/IdeaProjects/KarinaSeven/src/Example.txt");

        p("File Name: " + f1.getName());
        p(f1.getPath());
        p(f1.getAbsolutePath());
        p(f1.getParent());
        p(f1.exists()? "exist" : "doea not exists");
        p(f1.canWrite() ? "yes" : "no");
        p(f1.canRead() ? "yes" : "no");
        p("is " + (f1.isDirectory() ?" " : "not " + "directory"));
        p(f1.isFile() ? "is normal file" : "might be a named pipe");
        p(f1.isAbsolute() ? "yes" : "no");
        p("Last modified: " + f1.lastModified());
        p("File size: " + f1.length() + "Bytes");
    }
}
