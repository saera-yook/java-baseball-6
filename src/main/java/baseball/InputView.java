package baseball;

import static baseball.MessageContainer.ASK_RESTART;
import static baseball.MessageContainer.ENTER_NUMBERS;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {
    public List<Integer> readNumbers() {
        System.out.print(ENTER_NUMBERS);
        String input = Console.readLine();
        Validator.check3EqualToLengthOf(input);
        Validator.checkIs1To9(input);
        Validator.checkDuplicateNumber(input);
        return Converter.convert(input);
    }

    public String readChoice() {
        System.out.println(ASK_RESTART);
        String input = Console.readLine();
        Validator.checkIs1Or2(input);
        return input;
    }
}
