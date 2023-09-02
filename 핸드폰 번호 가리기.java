class Solution {
    public String solution(String phone_number) {
        StringBuilder builder = new StringBuilder("");
        int star = phone_number.length()-4;
        String divided = phone_number.substring(star);
        for(int i = 0 ; i < star; i++){
            builder.append("*");
        }
        builder.append(divided);
        
        return builder.toString();
    }
}
