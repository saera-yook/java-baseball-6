package baseball.domain;

import java.util.List;

public class Computer {
    private final List<Integer> numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> compareTo(List<Integer> UserNumbers) {
        int totalMatchNumbers = (int) UserNumbers.stream().filter(numbers::contains).count();
        int strikeCount = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (UserNumbers.get(i).equals(numbers.get(i))) {
                strikeCount++;
            }
        }
        int ballCount = totalMatchNumbers - strikeCount;
        return List.of(ballCount, strikeCount);
    }
}
