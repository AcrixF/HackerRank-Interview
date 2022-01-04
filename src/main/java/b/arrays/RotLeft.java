package b.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotLeft {

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        List<Integer> subListA = a.subList(0, d);
        List<Integer> subListB = a.subList(d, a.size());

        return Stream.of(subListB, subListA).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5);

        System.out.println(rotLeft(a, 0));
    }

}
