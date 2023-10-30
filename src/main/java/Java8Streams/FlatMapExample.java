package Java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.sun.tools.attach.VirtualMachine.list;

public class FlatMapExample {

    public static void main(String[] args) {

        List<List<String>> flatmapvar =  new ArrayList<>();
        flatmapvar.add(Arrays.asList("a", "b", "c"));
        flatmapvar.add(Arrays.asList("a", "b", "c","e"));
        flatmapvar.add(Arrays.asList("e", "b", "c","e"));
        flatmapvar.add(Arrays.asList("w", "x", "y","z"));


        System.out.println(
    flatmapvar.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList()));

    }
}
