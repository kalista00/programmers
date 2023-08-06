class Solution {
    public int solution(String my_string) {
        int answer = my_string.chars()
            .filter(n -> 48 <= n && 57 >= n)
            .map(Character::getNumericValue)
            .sum();
        return answer;
    }
}
