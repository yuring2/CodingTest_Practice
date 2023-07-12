package programmers.lv1;
import java.util.*;
class 가장가까운같은글자_복습 {
    public int[] solution(String s) {

        int[] answer = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            if(i!=0){

                int index = s.substring(0,i).lastIndexOf(s.charAt(i));
                if(index!=-1) answer[i] = i-index;
                else answer[i] = index;
            }else answer[i] = -1;
        }
        return answer;
    }
}