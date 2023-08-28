import java.util.*;
import java.util.stream.*;

class Solution {
    String[] id_list;
    int[] answer;
    String[][] splited;
    int[] reportNum;
    int k = 0;
    
    private void ans(String name){
        for(int i = 0; i <id_list.length;i++){
            if(id_list[i].equals(name)){
                answer[i] += 1;
                return;
            }
        }
    }
    private void adding(String name){
        for (int i = 0; i < splited.length;i++){
            if(splited[i][1].equals(name)){
                ans(splited[i][0]);
            }
        }
    }
    private void find(String name){
        for(int i = 0; i < this.id_list.length; i++){
            if(id_list[i].equals(name)){
                if(this.reportNum[i] >= k){
                    return;
                }
                this.reportNum[i] += 1;
            }
        }
    }
    
    public int[] solution(String[] id_list, String[] report, int k) {
        this.k = k;
        this.id_list = id_list;
        this.answer = new int[id_list.length];
        this.reportNum = new int[id_list.length];
        Set<String> set = Arrays.stream(report)
            .collect(Collectors.toCollection(HashSet::new));
        
        this.splited = new String[set.size()][2];
        int i = 0;
        for(String spl : set){
            String[] a = spl.split(" ");
            this.splited[i] = a;
            find(a[1]);
            i++;
        }
        for(int z = 0; z < this.reportNum.length;z++){
            if(this.reportNum[z] >=k){
                adding(id_list[z]);
            }
        }
        
        
        return this.answer;
    }
}

//Set으로 중복값 제거
//배열생성해서 split한 배열 넣기
//넣으면서 신고 횟수 배열에 숫자 추가
//2가되면 break;
//신고횟수에서 2인값의 string타입이랑 equals되는 report안에있는 배열의 index에 있는 값을 answer인덱스에 1++
//어떤 아이디인지 확인하고 배열에 값 추가하는 매소드
