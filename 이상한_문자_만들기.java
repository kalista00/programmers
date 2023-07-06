class Solution {
    public String solution(String s) {
        String answer = "";
        boolean upper = true;
        StringBuilder builder = new StringBuilder();
        for(char alpha : s.toCharArray()){
            //문자아닐때
            if(!Character.isAlphabetic(alpha)){
                builder.append(alpha);
                upper = true;
            }else if(upper == true){
                builder.append(Character.toUpperCase(alpha));
                upper = false;
            }else{
                builder.append(Character.toLowerCase(alpha));
                upper = true;
            }
            //true일때 or false 일때
            
        }
        return builder.toString();
    }
}
//하나하나 나누기
//문자 아니면 boolean 타입 true 변경
//true false로 구분해서 upper or lower 
