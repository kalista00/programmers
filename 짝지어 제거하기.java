import java.util.*;

class Solution{
    private int answer = 0;
    private StringBuilder builder = new StringBuilder("");
    
    private void method(String s){
        if(s.equals("")){
            return;
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < s.length() - 1; i++){
            if(!s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))){
                list.add(s.substring(i, i + 2));
            }else{
                s.substring(i, i + 2) = "";
            }
        }
        return;
    }
    public int solution(String s){
        

        return answer;
    }
}
//boolean 타입으로 확인하는 매소드
//if()문으로 위의 탈출조건적용
//
