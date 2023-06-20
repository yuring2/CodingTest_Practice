package programmers.lv1;
import java.util.*;

class 개인정보수집유효기간 {
    public Integer[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        int t = convertDay(today);

        for(String term : terms){
            String[] arr = term.split(" ");
            map.put(arr[0], Integer.parseInt(arr[1]));
        }

        for(int i=0; i<privacies.length; i++){
            String[] arr = privacies[i].split(" ");
            // 여기서 getDate(privacy[0]) + (map.get(privacy[1]) * 28)는 특정 개인정보의 만료 날짜를 계산한 결과임
            if(convertDay(arr[0]) + (map.get(arr[1])*28) <= t) answer.add(i+1);
        }

        return answer.toArray(new Integer[0]);
    }


    private int convertDay(String date){
        String[] arr = date.split("\\.");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        return (28*12*year) + (28*month) + day;
    }
}
