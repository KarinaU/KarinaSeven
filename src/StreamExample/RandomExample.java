package StreamExample;

import java.util.Random;

/**
 * Created by IT_School on 21.11.2015.
 */
public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(1).forEach(System.out::println);

        //
        //
    }
}
