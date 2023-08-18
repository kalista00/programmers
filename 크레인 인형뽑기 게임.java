
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int a = 0;
        int b = 0;
        int[] c = new int[moves.length];
        for(int z = 0; z < moves.length ;z++ )
            {   for(int y = 0; y < board.length; y++)
                {   if(board[moves[z]] != 0])
                    {   b = board[y][moves[z]];
                        break;
                    }   
                }    
                if( a != b){
                    c[z] = 0;
                    a = ;
                }
                else{
                    a = b;
                }
                
            }

        return answer;
    }
}
