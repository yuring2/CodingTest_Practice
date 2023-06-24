package programmers.lv1;
import java.util.*;
class Solution {
    public int 문자열나누기(String s) {
        int answer = 1;
        char ch = s.charAt(0);
        int cnt = 1;

        for(int i=1; i<s.length(); i++){
            if(cnt==0){
                answer++;
                ch = s.charAt(i);
            }

            if(s.charAt(i)==ch) cnt++;
            else cnt--;
        }
        return answer;
    }
}
