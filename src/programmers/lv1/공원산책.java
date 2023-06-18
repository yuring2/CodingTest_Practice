package programmers.lv1;

import java.util.*;

/*주의 : 시작점이 0,0이 아닐수도 있음*/
class 공원산책 {
    public int[] solution(String[] park, String[] routes) {

        int dx = 0; // 행
        int dy = 0; // 열

        Boolean found = false;
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) =='S'){ // park[i] : 문자열
                    dx = i;
                    dy = j;
                    found = true;
                    break;
                }
            }
            // 여기로 오는 경우가 2가지 : 1. 시작점을 발견한 경우 2. 시작점을 아직 발견하지 못한 경우
            if(found) break;
        }

        for(String route : routes){
            String direc = route.split(" ")[0];
            Integer move = Integer.parseInt(route.split(" ")[1]);

            if("N".equals(direc)){  // 북
                // 범위초과 하는지 확인
                if(dx-move < 0) continue;

                // 장애물 확인
                Boolean flag = false;
                for(int i=1; i<=move; i++){
                    if(park[dx-i].charAt(dy)=='X'){
                        flag = true;
                        break;
                    }
                }

                if(flag) continue;  // 장애물이 발견됐으면 flag가 true 로 바뀌었을 것
                // 중간에 장애물이 없는 것을 확인했으면 해당 위치로 이동
                dx = dx - move;
            }
            else if("S".equals(direc)){ // 남
                // 범위초과 하는지 확인
                if(dx+move > park.length-1) continue;

                // 장애물 확인
                Boolean flag = false;
                for(int i=1; i<=move; i++){
                    if(park[dx+i].charAt(dy)=='X'){
                        flag = true;
                        break;
                    }
                }
                if(flag) continue;
                // 중간에 장애물이 없는 것을 확인했으면 해당 위치로 이동
                dx = dx + move;
            }
            else if("W".equals(direc)){ // 서
                // 범위초과 하는지 확인
                if(dy-move < 0) continue;

                // 장애물 확인
                Boolean flag = false;
                for(int i=1; i<=move; i++){
                    if(park[dx].charAt(dy-i)=='X'){
                        flag = true;
                        break;
                    }
                }
                if(flag) continue;
                // 중간에 장애물이 없는 것을 확인했으면 해당 위치로 이동
                dy = dy - move;
            }
            else if("E".equals(direc)){ // 동
                // 범위초과 하는지 확인
                if(dy+move > park[0].length()-1) continue;

                // 장애물 확인
                Boolean flag = false;
                for(int i=1; i<=move; i++){
                    if(park[dx].charAt(dy+i)=='X'){
                        flag = true;
                        break;
                    }
                }
                if(flag) continue;
                // 중간에 장애물이 없는 것을 확인했으면 해당 위치로 이동
                dy = dy + move;
            }

        }


        int[] answer = new int[2];
        answer[0] = dx; answer[1] = dy;
        return answer;
    }
}
