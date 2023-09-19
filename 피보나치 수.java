import java.util.*;

class Solution {
    public long solution(int n) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<>();
        list.add(0L);
        list.add(1L);
        for(int i = 2; i <= n; i++){
            list.add((list.get(i-1) + list.get(i-2))  % 1234567);
        }
        answer = list.get(n);
        return answer;
    }

}
//다른방식도 풀어보기
