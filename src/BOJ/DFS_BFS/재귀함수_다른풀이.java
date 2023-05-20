package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 재귀함수_다른풀이 {
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dfs(n);

    }

    static void dfs(int num){
        if(num==0){
            return;
        }else{
            dfs(num-1);
            System.out.print(num+ " ");
        }
    }
}
