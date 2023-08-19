class Solution {
    private int result = 0;
    private int method(int num){
        if(result >= 500){
            return -1;
        }else if(num == 1){
            return result;
        }
        if(num % 2 == 0){
            result += 1;
            return method(num / 2);
        }
        else if(num % 2 == 1){
            result += 1;
            return method(num * 3 + 1);
        }
        return -1;
    }
    public int solution(int num) {
        int answer = method(num);
        return answer;
    }
}
//나누기 매소드
//곱하고 1더하는 매소드
