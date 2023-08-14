class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int garo = 1; garo <= yellow; garo++){
            for(int sero = 1; sero <= garo; sero++){
                //System.out.println(garo + "dddd" + sero);
                int size = (sero + 2) * (garo + 2);
                if(size == brown + yellow && garo * sero == yellow){
                    answer[0] = garo+2;
                    answer[1] = sero+2;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}
//yellow 경우의수 구하기
//경우의수 가로세로 +2 씩 한 값이랑 brown비교
