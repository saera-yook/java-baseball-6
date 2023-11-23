package baseball;

import baseball.domain.Computer;
import baseball.domain.NumberGenerator;
import baseball.domain.Umpire;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Umpire umpire = new Umpire();
        outputView.printWelcomeMessage();
        do {
            Computer computer = new Computer(new NumberGenerator().createThreeDifferentDigits());
            String call;
            do {
                call = umpire.call(computer.compareTo(inputView.readNumbers()));
                outputView.printResult(call);
            } while (!umpire.endGame(call));
            outputView.printEndGameMessage();
        } while (umpire.restartGame(inputView.readChoice()));
    }
}
