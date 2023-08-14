import java.util.*;
class Solution {
    private int[][] soopo = {{1,2,3,4,5},
                             {2,1,2,3,2,4,2,5},
                             {3,3,1,1,2,2,4,4,5,5}};
    private int[] rank(List<Integer> list){
        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        for(int i = 0; i < list.size(); i++){
            if(max == list.get(i)){
                list.set(i, i + 1);
            }else{
                list.set(i, 0);
            }
        }
        
        return list.stream().filter(n -> n != 0).mapToInt(Integer::intValue).toArray();
    }
    public int[] solution(int[] answers) { 
        int ques = answers.length;
        List<Integer> list = new ArrayList<>();
        for(int[] first : soopo){
            int correct = 0;
            for(int i = 0; i < ques; i++){
                if(first[i % first.length] == answers[i]){
                    System.out.println("ques" + ques);
                    System.out.println("first"+first.length);
                    correct++;
                    //System.out.println(correct);
                }
            }
            list.add(correct);
        }
        //System.out.println(list.toString());
        int[] answer = rank(list);
        return answer;
    }
}
//수포자 찍는방식 배열선언
//for문으로 하나씩 검사 (배열 크기 알려주는 매소드만들기)
//순서 정해서 리턴해주는 매소드

