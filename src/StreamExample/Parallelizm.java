package StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by IT_School on 21.11.2015.
 */
public class Parallelizm {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i =1; i < 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.parallelStream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 ==0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumbersArr));
    }
}
