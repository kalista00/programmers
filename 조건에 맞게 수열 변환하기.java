class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        for(int ar : arr){
            if(ar >= 50 && ar % 2 == 0){
                arr[i] = ar/2;
            }else if(ar < 50 && ar % 2 ==1){
                arr[i] = ar * 2;
            }
            i++;
        }
        return arr;
    }
}
