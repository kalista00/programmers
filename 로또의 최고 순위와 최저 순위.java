
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int a = 0;
        int b = 0;
        for(int i = 0; i < lottos.length; i++)
        {   if(lottos[i]==0){
                a++;
                }
            for(int z = 0; z < lottos.length; z++)
            {   
                if(lottos[i] == win_nums[z]){
                b++;
                }
            }
        }
        answer[0]= 7-(a+b);
        if(answer[0]==7)
        {answer[0]=6;}
        answer[1]= 7-b;
        if(answer[1]==7){
            answer[1]=6;
        }
        return answer;
    }
}
