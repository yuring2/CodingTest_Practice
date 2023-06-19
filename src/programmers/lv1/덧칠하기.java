package programmers.lv1;

import java.util.*;

class 덧칠하기 {
    public int solution(int n, int m, int[] section) {  /*m : 롤러의 길이*/

        int answer = 1;

        int start = section[0];
        int end = (section[0] +m)-1;

        for(int num : section){
            if(num >= start && num <= end) continue;
            else{
                start = num;
                end = (num+m)-1;
                answer++;
            }
        }

        return answer;
    }
}
