package baseball;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"gjkla", "12오", "509", "/3457"})
    void checkIsDigit(String input) {
        assertThatThrownBy(() -> Validator.checkIsDigit(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}