package StreamExample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by IT_School on 21.11.2015.
 */
public class Statistics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x)-> x).summaryStatistics();

        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());
    }
}
