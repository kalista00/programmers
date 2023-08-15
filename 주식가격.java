import java.util.*;
class Solution {
    private int second(int price, int[] prices, int i){
        for(int z = 0; z < prices.length - i - 1; z++){
            if(price > prices[z + i]){
                return z;
            }
        }
        return prices.length - i - 1;
    }
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            answer[i] = second(prices[i], prices, i);
        }
        return answer;
    }
}
//for로 하나씩 매서드에 넣기(리턴된값 배열에 넣기)
//비교하는 매서드
//
