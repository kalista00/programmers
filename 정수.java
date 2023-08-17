
class Solution {
    public long solution(long n) {   
        long answer = -1;
        long i = 1;
        for( i = 1 ; i * i <= n ; i++){
            if(i * i == n){
                answer = (i+1)*(i+1);
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}
