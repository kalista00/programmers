import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    int[] answer2 = {-1};
    public int[] solution(int[] arr) {
        
        if (arr == null || arr.length == 0) {
            return new int[0]; // 빈 입력 배열에 대한 처리
        }

        // 최소값 찾기
        int min = Arrays.stream(arr).min().orElse(0);
        int answer[] = Arrays.stream(arr)
                     .filter(n -> n != min)
                     .toArray();
        if(answer.length == 0){
            return answer2;
        }
        // 최소값을 제외한 배열 생성
        return answer;
    }
}
