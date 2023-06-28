package programmers.lv1;
import java.util.*;

// 사과는 상태에 따라 1~k점까지의 점수로 분류

// 사과 한 상자의 가격측정
// 한 상자에 과자를 m개씩 담아 포장한다.
// 상자에 담긴 사과의 가장 낮은 점수가 p점인 경우 pXm 이 해당 사과상자의 가격

class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int i=score.length-1; i>=0; i--){
            if((score.length-i)%m==0) answer+=score[i]*m;
        }
        return answer;
    }
}
