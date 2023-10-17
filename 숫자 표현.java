class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int a = 1 ; a <= n / 2; a++){
            int c = a;
            for(int b = a + 1; c <= n ; b++){
                c = c + b;
                System.out.println(c);
                if(c == n){
                    ++answer;
                    break;
                }
            }
        }
        return answer;
    }
}
// 시간초과 코드
