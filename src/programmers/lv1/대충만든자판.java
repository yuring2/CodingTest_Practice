package programmers.lv1;

import java.util.*;
class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];
        int minIndex = Integer.MAX_VALUE;
        Boolean flag = false;
        int x = 0;

        for(String target : targets){
            for(int j=0; j<target.length(); j++){
                flag = false;
                minIndex = Integer.MAX_VALUE;

                for(String key : keymap){  // 더 작은 인덱스 값을 구한다.
                    int index = key.indexOf(target.charAt(j)); // 없으면 -1
                    if(index != -1) minIndex = Math.min(minIndex, index);
                }
                // 하나의 문자에 대해 keymap 탐색을 마쳤다면
                if(minIndex == Integer.MAX_VALUE){
                    flag = true;
                    answer[x] = -1;
                }
                else answer[x] += minIndex+1;

                if(flag==true) break; // 해당 타켓은 더이상 볼 필요 없음.

            }
            x++;
        }
        return answer;
    }

}
