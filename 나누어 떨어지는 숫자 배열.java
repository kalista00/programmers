import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
            .sorted()
            .filter(n -> n % divisor == 0)
            .toArray();
        if
        return answer;
    }
}
