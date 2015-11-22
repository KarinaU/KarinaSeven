package I_O_Stream;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by IT_School on 22.11.2015.
 */
public class _O_ISTest {
    public static void main(String[] args) throws IOException {

        //InputStream inFile = new FileInputStream("C:/Users/IT_School/IdeaProjects/KarinaSeven/src/Example.txt");

        //readFullyByByte(inFile);
        //System.out.println("\n\n\n");

        //InputStream inUrl = new URL("https://www.google.com.ua/").openStream();
        //readFullyByByte(inUrl);
        //System.out.println("\n");

        InputStream inArray = new ByteArrayInputStream(new byte[]{-127,-65,-66,-1,67,68,69});
        readFullyByByte(inArray);
        System.out.println("\n\n\n");
    }

    private static void readFullyByByte(InputStream in) throws IOException {
        while (true){
            int oneByte = in.read();
            if(oneByte != -1) {
                System.out.print((char)oneByte);
            }else{
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}
