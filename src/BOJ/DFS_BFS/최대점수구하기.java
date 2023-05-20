package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대점수구하기 {
    static int n;  // 문제의 개수
    static int m; // 제한 시간
    static int[] score;
    static int[] times;
    static int maxScore = Integer.MIN_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        score = new int[n]; times = new int[n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            score[i] = a; times[i] = b;
        }

        dfs(0,0,0);
        System.out.println(maxScore);

    } // end of main


    static void dfs(int j, int sum, int time){
        if(time > m) return;
        if(j==n){
            maxScore = Math.max(maxScore,sum);
        }else{
            dfs(j+1,sum+score[j],time+times[j]);
            dfs(j+1,sum,time);
        }


    }


}
