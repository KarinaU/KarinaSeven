package I_O_Stream_two;

import java.io.*;

/**
 * Created by IT_School on 28.11.2015.
 */
public class DataIODemo {
    public static void main(String[] args)  throws IOException{

        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\Text.txt"))){

            dout.writeDouble(98.6);
            dout.writeInt(100);
            dout.writeBoolean(true);

        }catch (FileNotFoundException e){
            System.out.println("Cannot Open Output File");
            return;

        }catch (IOException e){
            System.out.println("I/O Error " + e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("D:\\Text.txt"))){


            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println(d + " " + i + " " + b);

        }catch (FileNotFoundException e){
            System.out.println("Cannot Open Output File2");
            return;

        }catch (IOException e){
            System.out.println("I/O Error2 " + e);
        }
    }
}
