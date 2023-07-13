package programmers.lv1;
import java.util.*;

class 달리기경주_복습 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        for (String player : callings) {
            int currRank = rankMap.get(player);

            String beforePlayer = players[currRank - 1];  // 앞서는 선수

            //players 갱신
            players[currRank - 1] = player;
            players[currRank] = beforePlayer;
            //rankMap 갱신
            rankMap.put(player, currRank - 1);
            rankMap.put(beforePlayer, currRank);
        }

        return players;
    }
}// end of solution

