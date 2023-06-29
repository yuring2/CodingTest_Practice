package programmers.lv1;
import java.util.*;

// 조카가 할 수 있는 발음 : "aya", "ye", "woo", "ma"
class 옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String str : babbling){

            if(str.contains("ayaaya") || str.contains("yeye") || str.contains("woowoo") || str.contains("mama")) continue;

            str = str.replace("aya"," ");
            str = str.replace("ye"," ");
            str = str.replace("woo"," ");
            str = str.replace("ma"," ");
            str = str.replace(" ","");

            if(str.length()==0) answer++;
        }

        return answer;
    }
}
