package programmers.lv1;
import java.util.*;
class 명예의전당 {
    public int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];
        //int[] arr = new int[k];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<score.length; i++){
            if(list.size() < k){ // k=3
                list.add(score[i]);
                Collections.sort(list); // 오름차순 정렬
                answer[i] = list.get(0);
                continue;
            }

            if(list.size() == k){
                int min = list.get(0);
                if(score[i] > min){
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);

                }
                answer[i] = list.get(0);
            }

        }
        return answer;
    }
}
