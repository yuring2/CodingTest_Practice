package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 경로탐색_dfs {
    static int n;
    static int m;
    static int[][] graph;
    static int[] checked;
    static int answer;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());  // 정점의 개수
        m = Integer.parseInt(st.nextToken());  // 간선의 수
        graph = new int[n+1][n+1];
        checked = new int[n+1];
        answer = 0;

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }

        checked[1] = 1;
        dfs(1);
        System.out.println(answer);



    } // end of main

    public static void dfs(int j){
        if(j==n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(checked[i]==0 && graph[j][i]==1){  // 아직 방문을 안했고, 갈 수 있는 경로이면
                    checked[i] = 1;
                    dfs(i);
                    checked[i] = 0; // 백 할 때 체크를 풀어주어야 함..
                }
            }
        }
    }


}
