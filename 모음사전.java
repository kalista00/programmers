import java.util.*;

class Solution {
    String[] aeiou = {"A", "E" ,"I" , "O", "U"};
    
    public List<String> gener(String word){
        List<String> list = new ArrayList<>();
        list.add(word);
        if(word.length() == 5){
            return list;
        }else{
            for(String s : aeiou){
                list.addAll(gener(word + s));
            }
            return list;
        }
    }
    public int solution(String word) {
        return gener("").indexOf(word);
    }
}
