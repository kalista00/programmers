class Solution {
    //StringBuilder builder
    public int solution(String myString, String pat) {
        int answer = 0;
        String abc = "";
        char[] array = myString.toCharArray();
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] == 'A' ? 'B' : 'A';
            abc = abc + String.valueOf(array[i]);
        }
        if(abc.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}
