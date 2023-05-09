package BOJ.구현;

import java.util.Scanner;

// 그냥 단순하기 생각하자
// 구간 1일 때 석순과 종유석을 더해서 값을 도출해야하니까 따로 저장
public class 개똥벌레 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동굴의 길이
        int H = sc.nextInt(); // 동굴의 높이

        // 석순과 종류석 입력받기
        int[] s = new int[H+1]; // 석순
        int[] j = new int[H+1]; // 종유석

        for(int i=0; i<N/2; i++){ // N개의 줄에 장애물의 크기가 순서대로 주어진다고 나와있음
            int a = sc.nextInt();
            int b = sc.nextInt();
            s[a]++;
            j[b]++;
        }

        // 누적합
        for(int i=H; i>0; i--){
            s[i-1] = s[i]+s[i-1];
            j[i-1] = j[i]+j[i-1];
        }

        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for(int i=1; i<=H; i++){
            int temp = s[i]+j[H+1-i];
            if(temp < min){
                min = temp;
                // 새로운 최소 구간이 나타났으니까 카운트 리셋
                cnt = 1;
            } else if (temp==min) {
                cnt++;
            }
        }
        System.out.println(min + " " + cnt);
    } // end of main
}
