
class Solution {
    int[][] map;
    private void method(char[] location, int num){
        for(int i = this.map.length; i >= this.map.length - location.length; i--){
            //this.map[num][i-1] = Integer.valueOf(location.substring(location.length()-i-1,location.length()-i));
        }
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        this.map = new int[n][n];
        String[] answer = {};
        //StringInteger.valueOf()
        for(int i = 0; i < arr1.length;i++){
            char[] b = Integer.toString(arr1[i], 2).toCharArray();
            method(b ,i);
            //a.substring(a.length-i-1,a.length()-i);
        }
        
        //while()
        //System.out.println(map[n-1][n-1]);
        return answer;
    }
}
