package I_O_Stream_two;

/**
 * Created by IT_School on 28.11.2015.
 */
public class AssertDemo {
    static  int val = 3;

    static int getnum(){
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for(int i=0; i<10; i++){
            n = getnum();

            assert n>0;

            System.out.println("n is " +n);
        }
    }
}
