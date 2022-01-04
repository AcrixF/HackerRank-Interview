package b.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MinimumBribesTest {

    @Test
    void minimumBribesPrintsTooChaoticWhenAPersonHasBribedMoreThanTwoPeople() {
        List<Integer> q = Arrays.asList(2, 5, 1, 3, 4);

        MinimumBribes.minimumBribes(q);
    }

    @Test
    void minimumBribesPrintsTheCorrectBribesInAQuee() {
        List<Integer> q = Arrays.asList(2, 1 ,5 ,3 ,4);

        MinimumBribes.minimumBribes(q);
    }
}
