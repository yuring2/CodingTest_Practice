package programmers.lv1;
import java.util.*;

class 체육복_정답코드{
    public int solution(int n, int[] lost, int[] reserve){

        int answer = n - lost.length;

        // 최대한 많은 학생이 체육복을 빌릴 수 있도록 오름차순 정렬
        // 예:) (1,4,2) (1,3,5)
        // 정렬을 하지 않은 경우 4번 학생이 3번 학생에게 체육복을 빌리게됨. 그러면 2번 학생은 체육복을 빌리지 못함
        // 만약 정렬을 했다면 2번 학생은 3번 학생에게, 4번학생은 5번학생에게 체육복을 빌릴 수 있음.
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 체육복을 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]+1==reserve[j]) || (lost[i]-1==reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;

    } // end of solution()
}
