package programmers.lv1;
import java.util.*;
class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for(int i=0; i <s.length(); i++){
            int count = 0;
            char ch = s.charAt(i);

            while(count < index){
                ++ch;   // 한번 증가
                if(ch > 'z') ch-=26;
                if(skip.contains(ch+"")) continue;
                else count++;
            }
            answer+=ch;
        }

        return answer;
    }
}