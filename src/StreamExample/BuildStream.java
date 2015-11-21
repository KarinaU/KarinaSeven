package StreamExample;

import java.util.Date;
import java.util.stream.Stream;

/**
 * Created by IT_School on 21.11.2015.
 */
public class BuildStream {
    public static void main(String[] args) {

        Stream<Date> stream = Stream.generate(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new Date();});
        stream.forEach(p -> System.out.println(p));
    }
}