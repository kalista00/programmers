class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int num = 0;
        for(int i = 0 ; i < photo.length; i++){
            for(int z = 0; z < photo[i].length; z++){
                for(int y = 0; y < name.length; y++){
                    if(photo[i][z].equals(name[y])){
                        num += yearning[y];   
                    }
                }
            }
            answer[i]= num;
            num=0;
        }
        return answer;
    }
}

//if 문으로 name[1] 과 같으면 yearning[1] 점을 answer 배열에 넣기

//for  
    //for
        //for
        
