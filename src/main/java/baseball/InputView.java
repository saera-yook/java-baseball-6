package baseball;

import static baseball.MessageContainer.ASK_RESTART;
import static baseball.MessageContainer.ENTER_NUMBERS;

import baseball.domain.BaseballValidator;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {
    public List<Integer> readNumbers() {
        System.out.print(ENTER_NUMBERS);
        String input = Console.readLine();
        BaseballValidator.check3EqualToLengthOf(input);
        BaseballValidator.checkIs1To9(input);
        BaseballValidator.checkDuplicateNumber(input);
        return Converter.convert(input);
    }

    public String readChoice() {
        System.out.println(ASK_RESTART);
        String input = Console.readLine();
        BaseballValidator.checkIs1Or2(input);
        return input;
    }
}
