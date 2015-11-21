package StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IT_School on 21.11.2015.
 */
public class CollectionStream {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<Integer>();
       // for(int i = 1; i < 10; i++){
       //     list.add(i);
       // }
       // Stream<Integer> stream = list.stream();
        //List<Integer> evenNumberList = stream.filter(i-> i%2 ==0).collect(Collectors.toList());
        //System.out.println(evenNumberList);

        //Integer[] evenNumberArr = stream.filter(i-> i%2 ==0).toArray(Integer[]::new);
        //System.out.println(Arrays.toString(evenNumberArr));

        //evenNumberArr
               // .stream()
               // .filter(e -> e.strartsWith("a"))
               //.toList();


        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s-> {System.out.println("filter:" + s);
                    return true;});
    }
}
