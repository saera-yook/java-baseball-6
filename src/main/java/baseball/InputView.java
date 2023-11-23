package baseball;

import static baseball.MessageContainer.ASK_RESTART;

import java.util.List;

public class InputView {
    public List<Integer> readNumbers(String input) {
        Validator.check3EqualToLengthOf(input);
        Validator.checkIs1To9(input);
        Validator.checkDuplicateNumber(input);
        return Converter.convert(input);
    }

    public String readChoice(String input) {
        System.out.println(ASK_RESTART);
        Validator.checkIs1Or2(input);
        return input;
    }
}
