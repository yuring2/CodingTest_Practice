package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 동전교환_복습 {
    static int n;  // 동전 종류의 개수
    static int m; // 거슬러줄 금액
    static Integer[] arr;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());

        m = Integer.parseInt(br.readLine());

        dfs(0,0);
        System.out.println(answer);
    } // end of main

    static void dfs(int cnt, int sum){
        if(answer < cnt) return;
        if(sum==m){
            answer = Math.min(answer,cnt);
        }else{
            for(int i=0; i<n; i++){
                dfs(cnt+1,sum+arr[i]);
            }
        }
    }


}
