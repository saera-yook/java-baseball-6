package baseball.domain;

import static baseball.domain.BaseballConstants.END_CONDITION;
import static baseball.domain.BaseballConstants.LOWER_BOUND_OF_DIGIT;
import static baseball.domain.BaseballConstants.RESTART_CONDITION;
import static baseball.domain.BaseballConstants.TOTAL_DIGITS;
import static baseball.domain.BaseballConstants.UPPER_BOUND_OF_DIGIT;

public class BaseballValidator {
    public static void check3EqualToLengthOf(String input) {
        if (TOTAL_DIGITS != input.length()) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkIs1To9(String input) {
        if (!input.chars().allMatch(c -> c >= LOWER_BOUND_OF_DIGIT && c <= UPPER_BOUND_OF_DIGIT)) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkDuplicateNumber(String input) {
        long totalUniqueNumber = input.chars().distinct().count();
        if (totalUniqueNumber != input.length()) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkIs1Or2(String input) {
        if (!RESTART_CONDITION.equals(input) && !END_CONDITION.equals(input)) {
            throw new IllegalArgumentException();
        }
    }
}
