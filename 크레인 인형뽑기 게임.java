import java.util.*;
class Solution {
    private static int[][] board;
    private static Stack<Integer> stack;
    private static int disappeared = 0;
    
    private void method(int move){
        
    }
    public int solution(int[][] board, int[] moves) {
        this.board = board;
        for(int move : moves){
            method(move);
        }
        int answer = disappeared;
        return answer;
    }
}
//private 으로 int[][] board , Stack stack 선언(클래스변수)
//(moves[i]) 로 매소드 호출
//moves[]
//board에서
//moves
