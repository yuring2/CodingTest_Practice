package BOJ.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] arr =new int[n+2][2];
        int[] dp = new int[n+2];
        StringTokenizer st;

        for(int i=1; i<n+1; i++){
            st = new StringTokenizer(bf.readLine()," ");
            int t = Integer.parseInt(st.nextToken()); // 기간
            int p = Integer.parseInt(st.nextToken()); // 금액

            arr[i][0] = t; // i일 차의 기간
            arr[i][1] = p; /// i일 차의 금액
        }

        int max = -1;


    } // end of main
}
