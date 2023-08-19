//시간초과 
class Solution {
    private int max;
    private int[][] triangle;
    
    private void method(int score, int num, int i){
        
        if(num+1 == triangle.length){
            if(this.max < score){
                this.max = score;
            }
            return;
        }
        method(score + triangle[num+1][i], num+1,i);
        method(score + triangle[num+1][i+1] , num+1,i+1);
    }
    public int solution(int[][] triangle) {
        this.triangle = triangle;
        
        method(triangle[0][0],0,0);
        
        return max;
    }
}
//시간초과 안나는 코드
class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
            }
        }
        
        return triangle[0][0];
    }
}
