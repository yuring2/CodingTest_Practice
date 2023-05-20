package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 정점이 많은 경우애는 인접행렬 ㄴㄴ
public class 경로탐색_인접리스트 {
    static int n;
    static int m;
    static int answer;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken()); // 정점
        m = Integer.parseInt(st.nextToken()); // 간선의 수
        graph = new ArrayList<ArrayList<Integer>>();
        ch = new int[n+1];
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            graph.get(Integer.parseInt(st.nextToken())).add(Integer.parseInt(st.nextToken()));
        }
        ch[1] = 1;
        dfs(1);
        System.out.println(answer);

    } // end of main

    static void dfs(int j){
        if(j==n){  // 경로 하나가 만들어짐
            answer++;
        }else{
            for(int nj : graph.get(1)){
                if(ch[nj]==0){
                    ch[nj]=1;
                    dfs(nj);
                    ch[nj]=0;
                }
            }
        }
    }


}
