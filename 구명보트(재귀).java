import java.util.*;
import java.util.stream.*;
class Solution {
    private int boat;
    private int limit;
    private void method(List<Integer> list){
        boolean finish = false;
        if(list.isEmpty()){
            
            return;
        }
        for(int i = 1 ; i < list.size(); i++){
            
            if(list.get(0) + list.get(i) <= this.limit){
                this.boat += 1;
                list.remove(i);
                list.remove(0);
                finish = true;
            
                break;
            }   
        }
        if(!finish){
            list.remove(0);
            this.boat += 1;
        }
        method(list);
    }
    public int solution(int[] people, int limit) {
        this.limit = limit;
        
        List<Integer> sorted = Arrays.stream(people)
            .boxed()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());
        method(sorted);
        
        return this.boat;
    }
}
