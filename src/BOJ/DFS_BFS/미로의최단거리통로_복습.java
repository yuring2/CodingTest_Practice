package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point4{
    int x;
    int y;
    public Point4(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 미로의최단거리통로_복습 {
    static int[][] board = new int[8][8];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] dis = new int[8][8];
    static int[][] ch = new int[8][8];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=1; i<=7; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=1; j<=7; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    } // end of main

    static void bfs(){
        Queue<Point4> q = new LinkedList<>();
        q.add(new Point4(1,1));
        ch[1][1] = 1;

        while(!q.isEmpty()){
            Point4 curr = q.poll();

            for(int i=0; i<4; i++){
                int nx = curr.x+dx[i];
                int ny = curr.y+dy[i];
                if(nx>=1&&nx<=7 && ny>=1&&ny<=7 && ch[nx][ny]==0){
                    ch[nx][ny]=1;
                    dis[nx][ny] = dis[curr.x][curr.y]+1;
                    q.add(new Point4(nx, ny));
                }
            }
        }



    }


}
