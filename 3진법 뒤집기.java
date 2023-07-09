class Solution {
    public int solution(int n) {
        String str = Integer.toString(n, 3);
        StringBuilder builder = new StringBuilder(str);
        String reverse = builder.reverse().toString();
        int answer = Integer.valueOf(reverse, 3);
        return answer;
    }
}
