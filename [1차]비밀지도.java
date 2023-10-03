import java.util.*;

class Solution {
    int[][] map;
    private void method(char[] location, int i){
        int num = this.map.length;
        int loca = location.length;
        for(int a = num - 1 ; a >=  num - location.length; a--){
            --loca;
            if(location[loca] - 48 == 1){
                map[i][a] = 1;
            }
        }
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        this.map = new int[n][n];
        
        //StringInteger.valueOf()
        for(int i = 0; i < arr1.length;i++){
            char[] b = Integer.toString(arr1[i], 2).toCharArray();
            char[] c = Integer.toString(arr2[i], 2).toCharArray();     
            method(b ,i);
            method(c ,i);
        }
        String[] answer = new String[arr1.length];
        for(int j = 0; j < this.map.length; j++){
            String answ = "";
            for(int z = 0; z < this.map[0].length; z++){
                if(map[j][z] == 1){
                    answ += "#";
                }
                else{
                    answ += " ";
                }
            }
            answer[j] = answ;
        }
        return answer;
    }
}
