package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @Test
    void compareTo() {
        List<Integer> computerNumbers = List.of(1, 9, 4);
        Computer computer = new Computer(computerNumbers);
        List<Integer> userNumbers = List.of(4, 6, 7);
        List<Integer> actual = computer.compareTo(userNumbers);

        assertThat(actual).isEqualTo(List.of(1, 0));
    }
}