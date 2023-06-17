package programmers.lv1;
/*for문만 사용하면 시간초과*/
/*
<선수명, 등수> map 생성
*/
import java.util.*;

class 달리기경주 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }


        for (String player : callings) {
            int currRank = rankMap.get(player);
            // 앞서가는 선수 추출
            String beforePlayer = players[currRank - 1];

            // players 갱신
            players[currRank - 1] = player;
            players[currRank] = beforePlayer;

            // rankMap 갱신
            rankMap.put(player, currRank - 1);
            rankMap.put(beforePlayer, currRank);

        }

        return players;
    }
}// end of solution
