package programmers.lv1;
import java.util.*;
class 가장가까운같은글자 {
    public int[] solution(String s) {

        int[] answer = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            if(i!=0){
                // 현재 위치 이전의 부분 문자열에서 현재 문자와 같은 문자의 마지막 인덱스를 찾음
                int index = s.substring(0,i).lastIndexOf(s.charAt(i));
                if(index!=-1) answer[i] = i-index;
                else answer[i] = index;  // 이전에 같은 문자가 없는 경우 배열에 -1 저장
            }else answer[i] = -1; // 첫 번째 문자일 경우
        }

        return answer;
    }
}