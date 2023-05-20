package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 좌표를 큐에다가 넣기 위해
class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}


public class 미로의최단거리통로_bfs {
    static int[][] board = new int[8][8];
    static int[][] dis = new int[8][8];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=1; i<=7; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=1; j<=7; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(1,1);  // 출발점을 넘김
        if (dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);


    } // end of main

    static void bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x,y));
        board[x][y] = 1; // 출발점을 1로 체크

        while(!q.isEmpty()){
            Point point = q.poll();
            for(int i=0; i<4; i++){
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if(nx>=1&&nx<=7 && ny>=1&&ny<=7 && board[nx][ny]==0){
                    board[nx][ny]=1;
                    q.add(new Point(nx,ny));
                    dis[nx][ny] = dis[point.x][point.y]+1;
                }
            }
        }
    }


}
