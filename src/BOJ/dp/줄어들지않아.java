package BOJ.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// dp[1][i] : i로 시작하는 한 자리수의 개수
public class 줄어들지않아 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[][] dp = new long[65][10];

        for(int i=0; i<=9; i++){
            dp[1][i] = 1;
        }

        // 미리 dp 테이블 완성하기
        for(int k=2; k<=64; k++){  // 2자리수
            for(int i=0; i<=9; i++){ // i로 시작하는
                for(int j=i; j<=9; j++){
                    dp[k][i] += dp[k-1][j]; // dp[3][2] = dp[2][2]
                }
            }
        }

        int tc = Integer.parseInt(br.readLine());
        for(int i=0; i<tc; i++){
            int n = Integer.parseInt(br.readLine());
            long ans = 0;
            for(int j=0; j<=9; j++){
                ans+=dp[n][j];
            }
            System.out.println(ans);
        }





    } // end of main
}
