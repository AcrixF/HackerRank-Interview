package a.warmup;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMatcher {

    public static int findAllSockPairs(List<Integer> socks) {

        return socks.stream()
                .collect(Collectors.groupingBy(Function.identity()))
                .values()
                .stream()
                .mapToInt(sucks -> sucks.size() / 2)
                .sum();
    }
}
