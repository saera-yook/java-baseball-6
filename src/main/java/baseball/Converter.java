package baseball;

import java.util.List;
import java.util.stream.Stream;

public class Converter {
    public static List<Integer> convert(String input) {
        return Stream.of(Integer.parseInt(input)).toList();
    }
}
