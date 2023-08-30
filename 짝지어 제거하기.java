import java.util.*;
import java.util.stream.*;

class Solution{
    private int answer = 0;
    
    private void method(Stack<Character> stack){
        
    }
    
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        char[] toChar = s.toCharArray();
        IntStream.range(0, toChar.length)
            .mapToObj(i -> toChar[i])
            .forEach(stack::push);
        method(stack);

        
        return answer;
    }
}
