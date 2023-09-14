import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 짝을 이루는 문자 제거
            } else {
                stack.push(c); // 스택에 문자 추가
            }
        }
        
        // 남은 문자가 없으면 1, 있으면 0 반환
        return stack.isEmpty() ? 1 : 0;
    }
}

