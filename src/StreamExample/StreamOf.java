package StreamExample;

import java.util.stream.Stream;

/**
 * Created by IT_School on 21.11.2015.
 */
public class StreamOf {
    public static void main(String[] args) {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map : " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch :" + s);
                    return s.startsWith("A");
                });

    }
}