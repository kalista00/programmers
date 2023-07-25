import java.util.*;
class Solution {
    public int[][] solution(int n) {
        ArrayList<int[]> list = new ArrayList<>();
        go1(n, 1, 2, 3, list);
        int[][] answer = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
        answer[i] = list.get(i);
        }
        return answer;
    }
    
    
    public void go1(int n, int sta, int res, int end, ArrayList<int[]> list){
        int[] array = new int[2];
        if(n == 1){
            array[0] = sta;
            array[1] = end;
            list.add(array);
            
        }else{      
            go1(n-1, sta, end, res,list);    //어레이에 넣기
            array[0] = sta;
            array[1] = end;
            list.add(array);
            go1(n-1, res, sta, end, list);  
        }
    }
}
/*  배열크기 참고
2 = 3       2의 1제곱 + 1  

3 = 7       2 * 2 + 3

4 = 15      2 * 2 * 2 + 7

5 = 31      4 * 4 + 15

경유지*/
