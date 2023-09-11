class Solution {
    public String solution(int n) {
        StringBuilder builder = new StringBuilder("");
        String[] array = {"박","수","박"};
        for(int i = 1; i <= n; i++){
            builder.append(array[i % 2]);
        }
        return builder.toString();
    }
}
