//스트림 연습
import java.util.*;
import java.util.stream.Collectors; // Collectors를 임포트

class Solution {
    public long solution(long n) {
        String numStr = Long.toString(n);

        List<Integer> digits = numStr.chars()
                                     .mapToObj(Character::getNumericValue)
                                     .sorted(Collections.reverseOrder())
                                     .collect(Collectors.toList());

        StringBuilder builder = new StringBuilder();
        digits.forEach(builder::append);

        return Long.parseLong(builder.toString());
    }
}
