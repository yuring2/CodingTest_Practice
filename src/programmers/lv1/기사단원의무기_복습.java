package programmers.lv1;
import java.util.*;

class 기사단원의무기_복습 {
    public int solution(int number, int limit, int power) {
        int result = 0;

        for(int i=1; i<=number; i++){ // 1의 약수의 개수
            int cnt=0; // 약수의 개수

            for(int j=1; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    if(Math.pow(j,2)==i) cnt+=1;
                    else cnt+=2;
                }
            }

            if(cnt<=limit) result+=cnt;
            else result+=power;
        }
        return result;
    }
}

