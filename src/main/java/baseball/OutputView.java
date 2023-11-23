package baseball;

import static baseball.MessageContainer.WELCOME;

public class OutputView {
    public void printWelcomeMessage() {
        System.out.println(WELCOME);
    }

    public void printResult(String call) {
        System.out.println(call);
    }
}
