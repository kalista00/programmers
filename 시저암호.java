class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder ans = new StringBuilder();
        for(char c :s.toCharArray()) {
        ans.append(push(c, n));
        }
        return ans.toString();
    }
    public char push(char c, int n) {
    	if(!Character.isAlphabetic(c)) {
    		return c;
    	}else {
    		int a = Character.isUpperCase(c)? 'A' : 'a';
    		int po = c - a;
    		int w = (po + n) % ('Z'-'A'+1);
    		char answer = (char)w;
    		return (char)(a + w);
    	}
    }
}
