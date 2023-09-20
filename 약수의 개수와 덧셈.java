class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int c = 0;

        for(int i = left ; i <= right ; i++ ){
        c = 0;    
            for(int j = 1; j <= i; j++){
              if( i % j==0 )
                  c += 1;
            }
            if(c % 2==0)
                answer+=i;
            else
                answer-=i;
        }

        return answer;
    }
}
