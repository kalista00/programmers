import java.util.*;
class Solution {
    private static int[][] board;
    private static Stack<Integer> stack;
    private static int disappeared = 0;
    
    private void method(int move , int i){
        if(i == board.length){
            return;
        }else if(board[i][move-1] != 0){
            checkStack(board[i][move-1]);
            return;
        }
        method(move, ++i);
        
    }
    private void checkStack(int element){
        if(!stack.empty() && stack.peek() == element){
            stack.pop();
            disappeared += 2;
        }else{
            stack.push(element);
        }
    }
    public int solution(int[][] board, int[] moves) {
        this.board = board;
        this.stack = new Stack<Integer>();
        for(int move : moves){
            method(move, 0);
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
