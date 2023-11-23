package baseball;

import java.util.List;

public class Converter {
    public static List<Integer> convert(String input) {
        return input.chars().map(c -> c - '0').boxed().toList();
    }
}
