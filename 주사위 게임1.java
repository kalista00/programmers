class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        boolean bool_a = a % 2 == 1;
        boolean bool_b = b % 2 == 1;        
        if(bool_a && bool_b){
            answer = a*a + b*b;
        }else if(!bool_a && !bool_b){
            answer = a - b;
            if(answer < 0){
                answer = answer - answer*2;
            }
        }else{
            answer = 2 * (a +b);
        }
        
        return answer;
    }
}
