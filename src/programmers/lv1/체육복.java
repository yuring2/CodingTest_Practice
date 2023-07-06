package programmers.lv1;
import java.util.*;

// 학생들의 번호는 체격순
// 바로 앞번호나 뒷번호의 학생에게만 체육복을 빌려줄 수 있다.
// 최대한 많은 수의 학생이 체육복을 빌려 입도록!
// 전체 학생 수 n
// 체육복을 도난당한 학생들의 번호가 담긴 배열 lost
// 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve

// 여별옷을 가지고 왔는데 도난을 당했으면 -1 (즉 체육복을 빌려줄 수 없음)
class 체육복 {  // 76% 정답 코드,,, 다시풀기
    public int solution(int n, int[] lost, int[] reserve) {
        // 아래처럼 하면 안됨. 중복된 학생 있을 수 있으니까
        //int answer = (reserve.length) + (n-lost.length-reserve.length);
        int answer = reserve.length;
        int dup = 0;
        Arrays.sort(reserve);
        Arrays.sort(lost); // 중요

        for(int p : lost){
            int i = Arrays.binarySearch(reserve, p);
            if(i>=0){
                reserve[i] = -1;
                dup++;
            }else{
                int index1 = Arrays.binarySearch(reserve, p+1);
                if(index1 >=0){
                    answer++;
                    reserve[index1] = -1;
                }
                else{
                    int index2 = Arrays.binarySearch(reserve, p-1);
                    if(index2 >=0){
                        answer++;
                        reserve[index2] = -1;
                    }
                }
            }
        }
        answer += (n - (lost.length-dup)) - reserve.length;
        return answer;
    } // end of solution()
}
