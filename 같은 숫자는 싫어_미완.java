import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) { 
        Stack stack = new Stack();
        for(int i =0;i<arr.length;i++){
          if(!stack.isEmpty() && stack.peek()==arr[i]){   stack.pop();
              
          }
        
        stack.push(arr[i]);
            }
        int[] ar = new int[stack.size()];
        for(int z = 0; z<stack.size();z++){
        ar[z]= stack.pop();
        return ar;
    }
}
}
