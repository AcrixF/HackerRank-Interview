package a.warmup;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SockMatcherTest {

    @Test
    void findAllSockPairsReturnZeroPairWhenNoPairsFound() {
        List<Integer> socks = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer result = SockMatcher.findAllSockPairs(socks);

        assertThat(result).isZero();
    }

    @Test
    void findAllSockPairsReturnOnePairWhenSameSocksAreOdd() {
        List<Integer> socks = Arrays.asList(1, 1, 1, 2, 3, 4, 5);
        Integer result = SockMatcher.findAllSockPairs(socks);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void findAllSockPairsReturnTwoPairsWhenSameSocksAreEven() {
        List<Integer> socks = Arrays.asList(1, 1, 1, 1, 2, 3, 4, 5);
        Integer result = SockMatcher.findAllSockPairs(socks);

        assertThat(result).isEqualTo(2);
    }
}
