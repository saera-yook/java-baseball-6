package baseball;

import static baseball.MessageContainer.END_GAME;
import static baseball.MessageContainer.WELCOME;

public class OutputView {
    public void printWelcomeMessage() {
        System.out.println(WELCOME);
    }

    public void printResult(String call) {
        System.out.println(call);
    }

    public void printEndGameMessage(boolean endGameCondition) {
        if (endGameCondition) {
            System.out.println(END_GAME);
        }
    }
}
