package baseball;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"12", "1234", "dkssgj", "안녕안녕", "1 2 3"})
    void check3EqualToLengthOf_함수로_주어진_문자열의_길이가_3이_아니면_예외_발생(String input) {
        assertThatThrownBy(() -> Validator.check3EqualToLengthOf(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"gjkla", "12오", "509", "/3457"})
    void checkIs1To9_함수로_주어진_문자열이_1부터_9까지_숫자로만_이루어져있지_않으면_예외_발생(String input) {
        assertThatThrownBy(() -> Validator.checkIs1To9(input)).isInstanceOf(IllegalArgumentException.class);
    }
}