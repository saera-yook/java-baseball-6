package baseball;

import static baseball.MessageContainer.BALL;
import static baseball.MessageContainer.NOTHING;
import static baseball.MessageContainer.STRIKE;

import java.util.List;

public class Umpire {
    public String call(List<Integer> counts) {
        if (counts.stream().allMatch(count -> count.equals(0))) {
            return NOTHING;
        }
        if (counts.get(0).equals(0)) {
            return counts.get(1) + STRIKE;
        }
        if (counts.get(1).equals(0)) {
            return counts.get(0) + BALL;
        }
        return counts.get(0) + BALL + " " + counts.get(1) + STRIKE;
    }

    public boolean endGame(String call) {
        return "3스트라이크".equals(call);
    }
}
