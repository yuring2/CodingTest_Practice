package programmers.lv1;
import java.util.*;

class 카드뭉치_투포인터_복습 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "Yes";
        //투포인터
        int cards1Index = 0;
        int cards2Index = 0;

        int cards1MaxIndex = cards1.length-1;
        int cards2MaxIndex = cards2.length-1;

        for(String g : goal){
            if(cards1Index <= cards1MaxIndex &&  cards1[cards1Index].equals(g)) cards1Index++;
            else if(cards2Index <= cards2MaxIndex &&  cards2[cards2Index].equals(g)) cards2Index++;
            else{
                result = "No";
                break;
            }
        } // end of for
        return result;
    } // end of solution()
}
