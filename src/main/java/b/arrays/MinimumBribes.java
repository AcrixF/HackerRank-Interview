package b.arrays;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MinimumBribes {

    public static void minimumBribes(List<Integer> q) {

        Map<Integer, Integer> stickerByPosition = new LinkedHashMap<>();

        for (int i = 0; i < q.size(); i++) {
            stickerByPosition.put(q.get(i), i + 1);
        }

        List<Map.Entry<Integer, Integer>> expected = stickerByPosition.entrySet().stream()
            .filter(entry -> (!Objects.equals(entry.getKey(), entry.getValue())) && (entry.getKey() - entry.getValue() > 0) )
                .collect(Collectors.toList());

        int bribes = 0;

        for (Map.Entry<Integer,Integer> pair: expected) {
            int bribesPerPerson = pair.getKey() - pair.getValue();

            if (bribesPerPerson > 2) {
                System.out.println("Too chaotic");
                bribes = 0;
                break;
            }

            bribes += bribesPerPerson;
        }

        if (bribes > 0)
            System.out.println(bribes);
    }
}
