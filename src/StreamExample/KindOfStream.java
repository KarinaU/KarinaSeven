package StreamExample;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by IT_School on 21.11.2015.
 */
public class KindOfStream {
    public static void main(String[] args) {
        Arrays.asList("a1", "a2","a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.range(-30,30)
                .forEach(System.out::println);
    }
}
