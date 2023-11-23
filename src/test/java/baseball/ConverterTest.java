package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void convert() {
        List<Integer> actual = Converter.convert("123");

        assertThat(actual).containsExactly(1, 2, 3);
    }
}