package baseball;

import static baseball.BaseballConstants.LOWER_BOUND_OF_DIGIT;
import static baseball.BaseballConstants.TOTAL_DIGITS;
import static baseball.BaseballConstants.UPPER_BOUND_OF_DIGIT;

public class Validator {
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
}