import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] non1= {-1};
        int[] answer = Arrays.stream(arr)
            .sorted()
            .filter(n -> n % divisor == 0)
            .toArray();
        if(answer.length == 0){
            System.out.println("d");
            return non1;
        }
        return answer;
    }
}
