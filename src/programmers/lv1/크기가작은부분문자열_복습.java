package programmers.lv1;
import java.util.*;

class 크키가작은부분문자열_복습 {
    public int solution(String t, String p) {
        int cnt = 0;

        for(int i=0; i < (t.length()-p.length())+1; i++){
            if(Long.parseLong(t.substring(i,i+p.length())) <= Long.parseLong(p)) cnt++;
        }

        return cnt;
    }
}
