package StreamExample;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IT_School on 21.11.2015.
 */
public class StreamExp {
    public static void main(String[] args) {

    List<String> myList = Arrays.asList("a1", "a2", "b2", "b1", "c2", "c1");

   myList
        .stream()
           .filter(s -> s.startsWith("c"))
           .map(String::toUpperCase)
           .sorted()
           .forEach(System.out::println);

    }
}
