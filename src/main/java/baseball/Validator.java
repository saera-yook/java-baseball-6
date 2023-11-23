package baseball;

public class Validator {
    public static void checkIsDigit(String inputNumber) {
        if (!inputNumber.chars().allMatch(c -> c >= '1' && c <= '9')) {
            throw new IllegalArgumentException();
        }
    }
}
