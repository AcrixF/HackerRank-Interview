package b.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class RotLeftTest {

    List<Integer> a = null;

    @BeforeEach
    void setup() {
        a =  Arrays.asList(1, 2, 3, 4, 5);
    }

    @Test
    void rotLeftReturnExpectedArrayWhenZeroLeftMovements() {

        List<Integer> result = RotLeft.rotLeft(a , 0);

        assertThat(result).isNotNull()
                .isNotEmpty()
                .hasSize(5)
                .containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void rotLeftReturnExpectedArrayWhenThreeLeftMovements() {

        List<Integer> result = RotLeft.rotLeft(a , 3);

        assertThat(result).isNotNull()
                .isNotEmpty()
                .hasSize(5)
                .containsExactly(4, 5, 1, 2, 3);
    }

    @Test
    void rotLeftReturnExpectedArrayWhenFiveLeftMovements() {

        List<Integer> result = RotLeft.rotLeft(a , 5);

        assertThat(result).isNotNull()
                .isNotEmpty()
                .hasSize(5)
                .containsExactly(1, 2, 3, 4, 5);
    }

}
