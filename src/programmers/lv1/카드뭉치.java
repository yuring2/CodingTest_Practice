package programmers.lv1;

import java.util.*;

class 카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        String result = "Yes";
        List<String> listCards1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> listCards2 = new ArrayList<>(Arrays.asList(cards2));

        for(String g : goal){
            if(!listCards1.isEmpty() && listCards1.get(0).equals(g)) listCards1.remove(0);
            else if(!listCards2.isEmpty() && listCards2.get(0).equals(g)) listCards2.remove(0);
            else{
                result = "No";
                break;
            }
        }

        return result;
    }
}
