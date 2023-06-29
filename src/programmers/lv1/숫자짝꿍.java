package programmers.lv1;
import java.util.*;
class 숫자짝꿍 {
    public String solution(String X, String Y) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> Xmap = new HashMap<>();
        HashMap<Character, Integer> Ymap = new HashMap<>();

        for(Character ch : X.toCharArray()){
            if(Xmap.containsKey(ch)) Xmap.put(ch, Xmap.get(ch)+1);
            else Xmap.put(ch,1);
        }

        for(Character ch : Y.toCharArray()){
            if(Ymap.containsKey(ch)) Ymap.put(ch, Ymap.get(ch)+1);
            else Ymap.put(ch,1);
        }

        int tmp = Xmap.size() < Ymap.size() ? 0 : 1;

        if(tmp==0){
            for(Character c : Xmap.keySet()){
                if(Ymap.containsKey(c)){
                    int cnt = Math.min(Xmap.get(c), Ymap.get(c));
                    for(int i=0; i<cnt; i++) list.add(Character.getNumericValue(c));
                }
            }
        }else{
            for(Character c : Ymap.keySet()){
                if(Xmap.containsKey(c)){
                    int cnt = Math.min(Xmap.get(c), Ymap.get(c));
                    for(int i=0; i<cnt; i++) list.add(Character.getNumericValue(c));
                }
            }
        }

        // 예외처리 추가
        if(list.size()==0) return "-1";
        Collections.sort(list, Collections.reverseOrder());
        if(list.get(0)==0) return "0";

        StringBuilder sb = new StringBuilder();
        for(Integer i : list) sb.append(i);
        return sb.toString();
    }
}
                                      
                                      
