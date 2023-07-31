import java.util.*;

class Solution {
    class Count{
        public final int zero;
        public final int one;
        public Count(int zero, int one){
            this.zero = zero;
            this.one = one;
        }
        public Count add(Count other){
            return new Count(zero + other.zero, one + other.one);
        }
    }
    private Count count(int offsetX, int offsetY, int size, int[][] arr){
        int h = size / 2;
        for (int x = offsetX; x < offsetX + size; x++){
            for(int y = offsetY; y < offsetY + size; y++){
                if(arr[y][x] != arr[offsetY][offsetX]){
                    return count(offsetX, offsetY, h, arr)
                        .add(count(offsetX + h, offsetY, h, arr))
                        .add(count(offsetX, offsetY + h, h, arr))
                        .add(count(offsetX + h, offsetY + h, h, arr));
                }
            }
        }
        if(arr[offsetY][offsetX]==1){
            return new Count(0,1);
        }
        return new Count(1,0);
    }
    public int[] solution(int[][] arr) {
        //count 매서드 호출
        Count count = count(0 , 0 , arr.length , arr);
        return new int[] {count.zero, count.one};
    }
}
//         int[] answer = {};
//         //호출(length, arr)
        
//         //리턴 받으면 0과 1 개수 세서 배열에 넣고 답 제출
//         return answer;
//     }
    
//     private int[] divide(int size, int[][] arr){
//     // 나누기 size/2
//     // 나눈 크기로 search 호출(탐색)
//     // 본인호출    
//     }
    
//     private int[][] search(int size, int[][] arr){
//     //arr 탐색 (size 크기에 해당되는 값 List에 넣기)
//     //List 를 check로 보내기 -> boolean 받기
//         //true 면 0번째 index만 남겨두고 다 -1로 바꾸고 return
//         //false 면 그대로 return
//     }

//     private boolean check(List list){
//     //같은지 확인   
//     }
// }
// //arr.length
// //
// // 0 0
// // 0 0
// // dto 만들기
    
// // 비교할 구간 재귀호출 -> size/2
//     // 탈출정의
//     // 재반복 정의
//         //

// ////////

// //크기정의 (반복)
// 	//해당된 크기로 탐색 (반복)
// 		//같은지 확인
// 		//같을 때 -> 재귀
// 		//다를 때 -> 객체 전달
// //리턴 받으면 0과 1 개수 세서 배열에 넣고 답 제출
