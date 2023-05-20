package BOJ.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 동전0 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];
        for(int i=0; i<N; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int i=N-1; i>=0; i--){

            // 현재 동전의 가치가 K보다 작거나 같은경우
            if(coin[i] <= K){
                cnt+=K/coin[i];
                K = K%coin[i];
            }
        }
        System.out.println(cnt);
    } // end of main
}
