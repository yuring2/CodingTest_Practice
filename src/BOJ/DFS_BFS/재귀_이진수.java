package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 재귀_이진수 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dfs(n); // 11
    }

    static void dfs(int num){
        if(num==0){
            return;
        }else{
            dfs(num/2);
            System.out.print(num%2);
        }
    }

}
