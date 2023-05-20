package BOJ.dp;

import java.util.Scanner;

// dp[3][5] : 3번째 자리수가 5일 때 계단수를 저장
public class 쉬운계단수 {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        long[][] dp = new long[N+1][10];

        for(int i=1; i<10; i++){
            dp[1][i] = 1;  // 첫 번째 자릿수의 경우 경우의 수가 1~9까지 하나씩이다.
        }

        // 2번쨰 자릿수부터 N번쨰 자릿수까지 탐색
        for(int i=2; i<=N; i++){
            for(int j=0; j<10; j++){

            }
        }

        // 2번
    } // end of main
}




// 길이가 1인 계단수 1,2,3,4,5,6,7,8,9
// 길이가 2인 계단수 10, 12 / 21,23 / 32, 34  이런식으로 두개씩 생길 것이다. 하지만 9의 경우를 보자
// 9로 시작하는 경우 98 하나, 9보다 1 큰수인 10을 붙이면 910이다. 910? 은 계단수가 아니다. 910의 경우 9와 인접한 자리는 1이고 이는 1차이가 아니기 때문에 계단수가 될 수 없다.
// 9와 0은 뒤에 올 수 있는 게 하나밖에 없다.
