class Solution {
    private char[][] now;
    private char[][] route;
    private int x;
    private int y;
    private int[] result = new int[2];
    private void search(){
        for(int i = 0; i < now.length;i++){
            for(int z = 0; z < now[i].length; z++){
                if(now[i][z]=='S'){
                    this.x = i;
                    this.y = z;
                    System.out.println(this.x + " " + this.y);
                    break;
                }
            }
        }
    }
    private void logic(int start){
        if(start >= route.length){
            return;
        }
        switch(route[start][0]){
            case 'E' : 
                System.out.println("E입니다");
                int forE = route[start][2] - '0'; 
                if(check(0, forE)){
                    this.y += forE;
                    this.result[1] += forE;
                }
                break;
            case 'W' :
                System.out.println("W입니다");
                break;
            case 'S' :
                System.out.println("S입니다");
                break;
            case 'N' :
                System.out.println("N임");
                break;
            default :
                System.out.println("똥");
                break;
        }
        logic(++start);
    }
    private boolean check(int sero, int garo){
        if(sero != 0){
            if(sero > 0){
                for(int i = this.x + 1; i <= this.x + sero ; i++){
                    if(now[i][this.y] == 'X'){
                        return false;
                    }
                }
            }else{
                for(int i = this.x - sero; i >= this.x - 1 ; i--){
                    if(now[i][this.y] == 'X'){
                        return false;
                    }
                }
            }
        }else if(garo > 0){
            
        }else{
            
        }
        return true;
    }
    public int[] solution(String[] park, String[] routes) {
        this.now = new char[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++){
            this.now[i] = park[i].toCharArray();
        }
        this.route = new char[routes.length][3];
        for(int i = 0; i < routes.length; i++){
            this.route[i] = routes[i].toCharArray();
        }
        search();
        logic(0);
        return this.result;
    }
}
//배열 정의 클래스변수
//S위치 클래스변수로 
//이동거리 클래스변수

//S위치찾아서 x y 좌표 대입
//이동가능한지 확인하는 매소드 boolean
//가능하면 대입 + 값 변환
