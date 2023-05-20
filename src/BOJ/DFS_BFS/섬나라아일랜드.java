package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 섬나라아일랜드 {
    static int n;
    static int[][] board;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static int answer = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        board = new int[n+1][n+1];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=1; j<=n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(board[i][j]==1){  // 육지이면
                    answer++;
                    board[i][j] = 0;
                    dfs(i,j);
                }
            }
        }

        System.out.println(answer);

    } // en dof main


    static void dfs(int x, int y){
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=1&&nx<=n && ny>=1&&ny<=n && board[nx][ny]==1){
                board[nx][ny]=0;
                dfs(nx,ny);
            }
        }
    }


}
