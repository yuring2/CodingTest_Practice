package programmers.lv1;
import java.util.*;
class 기사단원의무기 {
    public int solution(int number, int limit, int power) {

        int result = 0;

        for(int i=1; i<=number; i++){
            int cnt=0; // 약수의 개수를 카운트하기 위한 변수

            // 약수 개수 구하기
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
