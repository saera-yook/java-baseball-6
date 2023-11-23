package baseball;

import java.util.List;

public class InputView {
    public List<Integer> readNumbers(String input) {
        Validator.check3EqualToLengthOf(input);
        Validator.checkIs1To9(input);
        Validator.checkDuplicateNumber(input);
        return Converter.convert(input);
    }
}
