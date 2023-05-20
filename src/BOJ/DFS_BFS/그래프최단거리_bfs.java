package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그래프최단거리_bfs {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph;
    static int ch[], dis[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());  // 정점의 개수
        m = Integer.parseInt(st.nextToken());  // 간선의 개수
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            graph.get(Integer.parseInt(st.nextToken())).add(Integer.parseInt(st.nextToken()));
        }

        ch = new int[n+1];
        dis = new int[n+1];

        //
        bfs(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : " + dis[i]);
        }

    } // end of main


    static void bfs(int j){
        Queue<Integer> q = new LinkedList<>();
        ch[1] = 1; // 체크배열 체크하고
        q.add(j);  // 큐에 넣기
        while(!q.isEmpty()) {
            int curr = q.poll(); // 1번 정점
            for (int nv : graph.get(curr)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    dis[nv] = dis[curr] + 1;
                    q.add(nv);
                }
            }
        }
    }


}
