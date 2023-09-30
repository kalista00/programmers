import java.util.*;
class Solution {
    Set<Integer> poke = new HashSet<>();
    
    public int solution(int[] nums) {
        int answer = 0;
        for(int num : nums){
            poke.add(num);
        }
        answer = poke.size();
        if(answer >= nums.length/2){
            answer = nums.length/2;
        }
        return answer;
    }
}
