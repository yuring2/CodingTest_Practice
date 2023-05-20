package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point2{
    int x;
    int y;

    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 토마토 {
    static int n;
    static int m;
    static int[][] board;
    static int[][] dis;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<Point2> q = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        m = Integer.parseInt(st.nextToken()); // 열
        n = Integer.parseInt(st.nextToken()); // 행

        board = new int[n + 1][m + 1];
        dis = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= m; j++) {
                int x = Integer.parseInt(st.nextToken());
                board[i][j] = x;
                if (x == 1) q.add(new Point2(i, j));  // 큐에 익은 토마토를 가지고 있는 좌표를 미리 담아놓고 시작해야한다.
            }
        }

        bfs();

        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (board[i][j] == 0) flag = false;  // 익지 않은 토마토가 존재
            }
        }

        int max = Integer.MIN_VALUE;
        if (flag) {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= 7; j++) {
                    max = Math.max(max, dis[i][j]);
                }
            }
            System.out.println(max);
        }
        else System.out.println(-1);

    } // end of main

    static void bfs(){
        while(!q.isEmpty()){
            Point2 curr = q.poll();
            for(int i=0; i<4; i++){
                int nx = curr.x+dx[i];
                int ny = curr.y+dx[i];
                if(nx>=1&&nx<=n && ny>=1&&ny<=m && board[nx][ny]==0){ // 안 익은 토마토가 있는 칸이라면
                    board[nx][ny] = 1;  // 토마토를 익히고
                    dis[nx][ny] = dis[curr.x][curr.y]+1;
                    q.add(new Point2(nx,ny));
                }
            }
        }
    }



}
