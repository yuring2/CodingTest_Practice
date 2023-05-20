package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 동전교환 {
    static int n;
    static int m;
    static Integer[] coin;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 동전 종류 개수
        coin = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            coin[i] = Integer.parseInt(st.nextToken());
        }

        m = Integer.parseInt(br.readLine()); // 거슬러줄 금액

        //Arrays.sort(coin, Collections.reverseOrder()); //  Collections.reverseOrder()를 사용하려면 객체형 배열이여야 한다.
        Arrays.sort(coin, Collections.reverseOrder());
        dfs(0,0);
        System.out.println(answer);


    } // end of main

    static void dfs(int cnt, int sum){
        if(cnt>=answer) return;
        if(sum > m) return;
        if(sum==m){
            answer = Math.min(answer, cnt);
        }else{
            for(int i=0; i<n; i++){
                dfs(cnt+1,sum+coin[i]);
            }
        }

    }


}
